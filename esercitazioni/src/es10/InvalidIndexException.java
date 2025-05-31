package es10;

public class InvalidIndexException extends Exception {
	public InvalidIndexException() {
		super("The given index is not valid");
	}
}
