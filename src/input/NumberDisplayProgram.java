package input;

import java.util.Scanner;

public class NumberDisplayProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");

		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println("You entered: " + number);
		} else {
			System.out.println("Invalid input. Please enter a valid integer.");
		}

		scanner.close();
	}
}
