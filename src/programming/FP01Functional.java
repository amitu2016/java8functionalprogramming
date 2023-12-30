package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		//printAllNumbersInListFunctional(list);
		//printEvenNumbersInListFunctional(list);
		//printSquaresOfNumbersInListFunctional(list);
		printSquaresOfEvenNumbersInListFunctional(list);
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> list) {
		list.stream()
		.filter(num -> num % 2 == 0)
		.map(num -> num * num)
		.forEach(System.out::println);
		
	}

	private static void printSquaresOfNumbersInListFunctional(List<Integer> list) {
		list.stream().map(num -> num * num)
		.forEach(System.out::println);
		
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
		//.filter(FP01Functional::findEven) //method reference
		.filter(number -> number %2 == 0) //lambda expression
		.forEach(System.out::println);

	}
}
