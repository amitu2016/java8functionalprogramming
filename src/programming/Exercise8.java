package programming;

import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//Cube every number and find the sum of cubes
		int sumOfCubes = numbers.stream()
							.map(num -> num * num * num)
							.reduce(0, Integer::sum);
		System.out.println(sumOfCubes);

	}

}
