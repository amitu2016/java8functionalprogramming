package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Passing behavior as parameters
		//here we are passing logic instead of data in parameter
		//We can change the logic as per requirement
		//We are passing stratagy
		filterNumbers(numbers, x -> x % 2 == 0, System.out::println);

	}

	private static void filterNumbers(List<Integer> numbers,
			Predicate<Integer> predicate, Consumer<Integer> action) {
		numbers.stream().filter(predicate).forEach(action);
	}

}
