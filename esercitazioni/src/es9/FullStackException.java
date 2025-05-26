package es9;

public class FullStackException extends Exception {
	public FullStackException() {
		super("Stack is full");
	}

	@Override public String toString() {
		return getMessage();
	}
}
