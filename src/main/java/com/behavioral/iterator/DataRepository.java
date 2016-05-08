package com.behavioral.iterator;

public class DataRepository implements Container {

	private String data[] = {"A", "B", "C"};

	@Override
	public Iterator getIterator() {
		return new DataIterator();
	}

	private class DataIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < data.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return data[index++];
			}
			return null;
		}
	}
}
