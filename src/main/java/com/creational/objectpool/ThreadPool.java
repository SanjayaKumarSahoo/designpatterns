package com.creational.objectpool;

public final class ThreadPool extends ObjectPool<Thread> {

	public ThreadPool(int expiryInSeconds) {
		super(expiryInSeconds);
	}
    @Override
    protected Thread create() {
        return new Thread();
    }

    @Override
    public boolean validate(Thread thread) {
        return thread.isAlive();
    }

    @Override
    public void expire(Thread thread) {
        thread.interrupt();
    }

}
