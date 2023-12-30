package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		//Print sum of all numbers in list
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}


}
