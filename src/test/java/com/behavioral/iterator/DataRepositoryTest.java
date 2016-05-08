package com.behavioral.iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataRepositoryTest {

	@Test
	public void testIterator() {
		Iterator iterator = new DataRepository().getIterator();

		assertTrue(iterator.hasNext());
		assertEquals("A", iterator.next());

		assertTrue(iterator.hasNext());
		assertEquals("B", iterator.next());

		assertTrue(iterator.hasNext());
		assertEquals("C", iterator.next());

		assertFalse(iterator.hasNext());
		assertNull(iterator.next());
	}
}
