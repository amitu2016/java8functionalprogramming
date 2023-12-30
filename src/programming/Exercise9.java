package programming;

import java.util.List;

public class Exercise9 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Find sum of odd numbers in the list
		int sumOfOddNumbers = numbers.stream()
										.filter(num -> num % 2 != 0)
										.reduce(0, Integer::sum);
		
		System.out.println(sumOfOddNumbers);
	}

}
