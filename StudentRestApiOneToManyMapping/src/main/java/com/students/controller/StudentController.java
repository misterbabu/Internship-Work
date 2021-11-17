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

import com.students.entity.Student;
import com.students.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentServ;
	@GetMapping
	private List<Student> getAll()
	{
		return studentServ.getAll();
	}
	@GetMapping("/{id}")
	private Student getById(@PathVariable int id)
	{
		return studentServ.getById(id);
	}
	@PostMapping
	private Student add(@RequestBody Student student)
	{
		return studentServ.addOrUpdate(student);	
	}
	@PutMapping("/{id}")
	private Student update(@PathVariable int id,@RequestBody Student student)
	{
		student.setSid(id);
		return studentServ.addOrUpdate(student);
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id)
	{
		studentServ.deleteById(id);
	}

}
