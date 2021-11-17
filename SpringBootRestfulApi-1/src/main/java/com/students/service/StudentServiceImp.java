package com.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.students.DAO.StudentDao;
import com.students.model.Student;
@Service
public class StudentServiceImp implements Studentservice {
	
	@Autowired
	private StudentDao studentDao; 
	@Transactional
	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
		
	}
	
	@Transactional
	@Override
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}
	
	@Transactional
	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
		
	}
	
	@Transactional
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
		
	}
	

}
