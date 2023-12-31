package programming;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Create a list with even numbers filtered out from the numbers list
		List<Integer> evenNumbers = numbers.stream()
											.filter(num -> num % 2 == 0)
											.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
	}

}
