package programming;

import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Print courses whose Name has at least 4 letters
		courses.stream().filter(s->s.length()>=4)
		.forEach(System.out::println);

	}

}
