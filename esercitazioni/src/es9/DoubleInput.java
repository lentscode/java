package es9;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

class DoubleInput {
	public static void main(String[] args) {
		int maxElements = 5;
		List<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);

		while (list.size() < maxElements) {
			try {
				String message = String.format(
					"Insert the %dº number > ",
					list.size() + 1
				);

				System.out.print(message);
				double num = scanner.nextDouble();
				list.add(num);
			} catch (InputMismatchException e) {
				System.out.println("Bad input, retry!");
				scanner.next();
			}
		}
	}
}
