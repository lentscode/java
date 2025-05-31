package es10;

import java.util.List;
import java.util.ArrayList;

public class CircularList<T> {
	private final List<T> list;
	private int current;

	public CircularList() {
		this.list = new ArrayList<T>();
		this.current = 0;
	}

	public int getCurrentPosition() {
		return current;
	}

	public int getSize() {
		return list.size();
	}

	public void add(T e) {
		list.add(current, e);
	}

	public T remove(int index) throws EmptyListException, InvalidIndexException {
		if (index < 0)
			throw new InvalidIndexException();

		if (list.size() == 0) 
			throw new EmptyListException();

		if (current == list.size() - 1)
			current--;

		return list.remove(index);
	}

	public void next() {
		current++;
		current %= getSize();
	}
	
	public void previous() {
		current--;
		current %= getSize();
	}

	public T getCurrentElement() {
		return list.get(current);
	}
}
