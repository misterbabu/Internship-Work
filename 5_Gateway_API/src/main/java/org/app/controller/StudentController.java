package org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	@Autowired
	private RestTemplate template;

	@GetMapping("/student-details/{id}")
	public String invokeService(@PathVariable int id) {
		return template.getForObject("http://STUDENT-SERVICE/student-provider/getStudent/"+id, String.class);
	}
	@GetMapping("/service-port")
	public String invokeServicePort() {
		return template.getForObject("http://STUDENT-SERVICE/student-provider/getPort/", String.class);
	}

	@GetMapping("/test")
	public String test() {
		return "working....";
	}

}
