package com.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.Student;
import com.students.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	public Student addOrUpdate(Student student)
	{
		return studentRepo.save(student);
	}
	public boolean deleteById(int id)
	{
		studentRepo.deleteById(id);
		return true;
	}
	public List<Student> getAll()
	{
		return studentRepo.findAll();
	}
	public Student getById(int id)
	{
		return studentRepo.findById(id).get();
	}

}
