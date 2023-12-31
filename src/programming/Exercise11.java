package programming;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise11 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Create a list with length of all courses titled
		
		List<Integer> coursesLength = courses.stream()
												.map(course -> course.length())
												.collect(Collectors.toList());
		
		System.out.println(coursesLength);
	}

}
