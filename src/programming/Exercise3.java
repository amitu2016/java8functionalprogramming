package programming;

import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Print courses containing the word "Spring"
		courses.stream().filter(s->s.contains("Spring"))
		.forEach(System.out::println);

	}

}
