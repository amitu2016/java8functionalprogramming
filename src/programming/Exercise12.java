package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exercise12 {

	public static void main(String[] args) {
		//Find Functional Interface behind the second argument of reduce method. 
		//Create an implementation for the Functional Interface.
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		
		int sum = numbers.stream() .reduce(0, accumulator);
		System.out.println(sum);

	}

}
