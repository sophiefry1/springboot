package org.launchcode.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}


	@RequestMapping(value = "hello", method = RequestMethod.POST)
	@ResponseBody
	public String helloPost(@RequestParam String name, @RequestParam String language) {
		if (name == null) {
			name = "World";
		}

		return createMessage(name, language);

		public static String createMessage (String n, String l){
			String greeting = "";

			if (l.equals("english")) {
				greeting = "Hello";
			} else if (l.equals("french")) {
				greeting = "Bonjour";
			} else if (l.equals("italian")) {
				greeting = "Bonjourno";
			} else if (l.equals("spanish")) {
				greeting = "Hola";
			} else if (l.equals("german")) {
				greeting = "Hallo";
			}

			return greeting + " " + n;
		}
	}
}