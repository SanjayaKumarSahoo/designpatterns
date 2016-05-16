package com.creational.objectpool;

import org.junit.Assert;
import org.junit.Test;

public class ThreadPoolTest {

	@Test
	public void testPool() {

		ThreadPool pool = new ThreadPool(5);
		Thread t1 = pool.checkOut();
		Assert.assertEquals(0, pool.getAvialblePoolSize());
		Assert.assertEquals(1, pool.getUsedPoolSize());

		pool.checkIn(t1);
		Assert.assertEquals(1, pool.getAvialblePoolSize());

		Thread t2 = pool.checkOut();
		Thread t3 = pool.checkOut();
		Assert.assertEquals(0, pool.getAvialblePoolSize());
		Assert.assertEquals(2, pool.getUsedPoolSize());

		pool.checkIn(t2);
		pool.checkIn(t3);
		Assert.assertEquals(0, pool.getUsedPoolSize());
		Assert.assertEquals(2, pool.getAvialblePoolSize());

		// object expiration is set 5 seconds, so waiting for 6 seconds
		try {
			Thread.sleep(6 * 1000);
		} catch (InterruptedException e) {
			Assert.fail();
		}

		Assert.assertEquals(0, pool.getUsedPoolSize());
		pool.checkOut();
		Assert.assertEquals(1, pool.getUsedPoolSize());
		Assert.assertEquals(0, pool.getAvialblePoolSize());
	}
}
