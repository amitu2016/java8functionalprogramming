package programming;

import java.util.Comparator;
import java.util.List;

public class FPSortedDemo2 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Sort the courses in reverse alphabetical order
		System.out.println("Sorting in reverse order..............");
		courses.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		
		//Sort According to String length
		System.out.println("Sorting according to string length............");
		courses.stream()
				.sorted(Comparator.comparing(course -> course.length()))
				.forEach(System.out::println);

	}

}
