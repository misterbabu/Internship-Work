package com.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.model.Student;
import com.students.service.Studentservice;

@RestController
@RequestMapping("api")
public class StudentController {
	@Autowired
	private Studentservice studentService;
	@GetMapping("students")
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	@PostMapping("student")
	public Student saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return student;
	}
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable int id)
	{
		Student student = studentService.getStudent(id);
		if(student==null) {
			throw new RuntimeException("Student with id"+id+"is not found");
		}
		return student;
	}
	@DeleteMapping("student/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		return "Student has deleted with id:"+id;
	}
	@PutMapping("student")
	public Student updateStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return student;
	}

}
