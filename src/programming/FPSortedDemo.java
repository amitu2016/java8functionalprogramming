package programming;

import java.util.List;

public class FPSortedDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Find Distinct sorted number
		System.out.println("Ascending order");
		numbers.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("Decending order");
		numbers.stream()
		.distinct()
		.sorted((a,b) -> -a.compareTo(b))
		.forEach(System.out::println);
	}

}
