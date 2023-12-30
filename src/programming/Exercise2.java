package programming;

import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Print All Courses individually
		courses.stream().forEach(System.out::println);
	}
}
