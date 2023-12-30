package programming;

import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		//Print cubes of all odd numbers
		list.stream()
		.filter(num -> num % 2 != 0)
		.map(num -> num * num * num)
		.forEach(System.out::println);

	}

}
