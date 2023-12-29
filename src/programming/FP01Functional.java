package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		//printAllNumbersInListFunctional(list);
		printEvenNumbersInListFunctional(list);
	}

	/*
	 * public static void print(Integer number) { System.out.println(number); }
	 */
	
	public static boolean findEven(int num) {
		return num % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// Functional programming focuses on what to do
		// Using method reference instead of lambda expression
		numbers.stream().forEach(System.out::println);

	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(FP01Functional::findEven) //method reference
		.forEach(System.out::println);

	}
}
