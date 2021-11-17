package com.students.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.students.Student;

@Controller
public class ApplicationController {
	@GetMapping("/stu/{input}")
	public String getData(@PathVariable String input, Model model) {
		String welcomeMessage = "Hello "+input+" Welcome";
		model.addAttribute("message",welcomeMessage);
		return "welcome";
		
	}
	@GetMapping("/getStudents")
	public String getStudent(Model model) {
		List<Student> students = Stream.of(new Student(1,"Navin",25),new Student(2,"Mohit",34),new Student(3,"Deepak",39)).collect(Collectors.toList());
		model.addAttribute("students",students);
		return "studentList";
		
	}

}
