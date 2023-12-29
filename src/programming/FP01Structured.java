package programming;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,13,4,6,3,4,12,15));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		
		//Structured programming focuses on how to do
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
	}
}
