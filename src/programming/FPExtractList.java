package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FPExtractList {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		List<Integer> doubledNumbers = numbers.stream()
												.map(num -> num*num)
												.collect(Collectors.toList());
		
		System.out.println(doubledNumbers);

	}

}
