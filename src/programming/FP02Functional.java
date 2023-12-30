package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		int sum = calculateSum(list);
		System.out.println(sum);
		
	}

	private static int calculateSum(List<Integer> list) {
		//Returns the sum of numbers, aggregate + next number
		return list.stream()
				//Using lambda expression
				//.reduce(0, (a,b) -> a+b);
				//Using method reference
				.reduce(0, Integer::sum);
	}

	
}
