package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,3,4,12,15));
	}
	
	public static void print(Integer number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		//Functional programming focuses on what to do
		//Using method reference instead of lambda expression
		numbers.stream().forEach(FP01Functional::print);
		
	}
}
