package programming;

import java.util.List;

public class FPDistinctDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Find distinct numbers in list
		numbers.stream()
			.distinct()
			.forEach(System.out::println);

	}

}
