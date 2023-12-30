package programming;

import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		//List of all odd numbers
		list.stream().filter(i -> i %2 != 0)
		.forEach(System.out::println);

	}

}
