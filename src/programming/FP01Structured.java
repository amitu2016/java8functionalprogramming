package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		// printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		// Structured programming focuses on how to do
		for (Integer num : numbers) {
			System.out.println(num);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {

		// Structured programming focuses on how to do
		for (Integer num : numbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

	}
}
