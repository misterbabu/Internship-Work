package com.students.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.model.Student;
import com.students.service.StudentService;

@RestController
@RequestMapping("/api/")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("student")
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
		Student savedStudent = studentService.createStudent(student);
		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
	}

}
