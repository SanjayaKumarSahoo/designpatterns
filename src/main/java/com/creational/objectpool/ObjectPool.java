package com.creational.objectpool;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ObjectPool<T> {

    private final long expirationTime;
    private ConcurrentHashMap<T, Long> locked;
    private ConcurrentHashMap<T, Long> unlocked;

    public ObjectPool(int expiryInSeconds) {
        locked = new ConcurrentHashMap<T, Long>();
        unlocked = new ConcurrentHashMap<T, Long>();
        expirationTime = expiryInSeconds * 1000; // in millis
    }

    // used to create object
    protected abstract T create();

    // used to validate object
    public abstract boolean validate(T o);

    // used to check expiration of objects
    public abstract void expire(T o);

    public void checkIn(T o) {
        locked.remove(o);
        unlocked.put(o, System.currentTimeMillis());
    }

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    // object has expired
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return t;
                    } else {
                        // object failed validation
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // no objects are available
        t = create();
        locked.put(t, now);
        return t;
    }

    public int getAvialblePoolSize() {
        return unlocked.size();
    }
    
    public int getUsedPoolSize() {
        return locked.size();
    }
}
