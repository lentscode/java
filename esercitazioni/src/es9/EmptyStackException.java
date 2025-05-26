package es9;

public class EmptyStackException extends Exception {
	public EmptyStackException() {
		super("Stack is empty");
	}

	@Override public String toString() {
		return getMessage();
	}
}
