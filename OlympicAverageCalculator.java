package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OlympicAverageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		int count = 0;

		System.out.println("Enter positive or zero real numbers, end with -1:");

		while (true) {
			try {
				double input = scanner.nextDouble();

				if (input == -1)
					break;

				if (input >= 0) {
					sum += input;
					count++;
				} else {
					System.out.println("Please enter a non-negative number.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid real number.");
				scanner.next(); // Clear the invalid input from the scanner
			}
		}

		double average = count > 0 ? sum / count : 0;
		System.out.println("Olympic average: " + average);

		scanner.close();
	}
}
