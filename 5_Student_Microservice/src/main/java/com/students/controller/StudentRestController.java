package com.students.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.Student;
import com.students.repository.StudentRepository;

@RestController
@RequestMapping("/student-provider")
public class StudentRestController {
	//@Value("${server.port}")
	//private int port;
	@Autowired
	private Environment env;
	

	@Autowired
	private StudentRepository repo;

	
	public StudentRestController(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@GetMapping(value = "/getStudent/{id}")
	public Optional<Student>getStudent(@PathVariable int id) {

		Optional<Student> student = repo.findById(id); 
		return student;

	}
	
	 @GetMapping(value="/getPort") 
	 public String portNumber() 
	 { 
		 String port = env.getProperty("local.server.port");
		 return "Application is up on port : "+port;

}
}
