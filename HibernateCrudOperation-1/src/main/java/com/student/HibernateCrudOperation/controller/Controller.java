package com.student.HibernateCrudOperation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.HibernateCrudOperation.dao.StudentDao;
import com.student.HibernateCrudOperation.model.Student;
@RestController
public class Controller {
	@Autowired
	StudentDao studentDao;
	@Autowired
	Student student;

	/*
	 * @RequestMapping("/student/{id}")
	 * 
	 * @ResponseBody public Student getStudentById(@PathVariable int id) {
	 * 
	 * Student student1 = studentDao.getStudentById(student.getSid());
	 * 
	 * return studentDao.getStudentById(id);
	 * 
	 * }
	 */
	@RequestMapping("/student/{id}")
	@ResponseBody
	public String getStudentById(@PathVariable int id)
	{
		return StudentDao.getStudentById(id).toString();
		
	}

}
