package es9;

import java.util.List;
import java.util.ArrayList;

public class Stack<E> {
	private static int MAX_LENGTH = 10;

	private List<E> list;

	public Stack() {
		this.list = new ArrayList<E>();
	}

	public void push(E e) throws FullStackException {
		if (isFull()) throw new FullStackException();

		list.add(e);
	}

	public E pop() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException();

		return list.remove(0);
	}

	public boolean isFull() {
		return list.size() >= MAX_LENGTH;
	}

	public boolean isEmpty() {
		return list.size() <= 0;
	}

	public boolean equals(Stack<?> other) {
		return list.equals(other.list);
	}

	@Override public String toString() {
		String base = "Size: " + list.size() + "\n";
		base += "[ ";

		for (E e : list) {
			base += e.toString();
			base += ", ";
		}

		base += "]";

		return base;
	}
}
