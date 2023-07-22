package com.example.designpatterns.behavioral.IteratorPattern;

public class NameRepository implements Container {
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	public NameRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {

			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {

			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
