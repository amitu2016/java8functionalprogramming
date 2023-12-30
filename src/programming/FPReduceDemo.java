package programming;

import java.util.List;

public class FPReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
		
		//Find maximum value
		int max  = list.stream().reduce(Integer.MIN_VALUE, (x,y) -> x > y ? x : y);
		System.out.println("Max Value : "+max);
		
		//Find minimum value
		int min = list.stream()
					.reduce(Integer.MAX_VALUE, (x,y) -> x < y ? x : y);
		System.out.println("Min Value : "+min);

	}

}
