package programming;

import java.util.List;

public class Exercise7 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Square every number in list and find sum of squares
		int sumOfSquares = numbers.stream()
								.map(num -> num*num)
								.reduce(0, Integer::sum);
		
		System.out.println(sumOfSquares);
	}

}
