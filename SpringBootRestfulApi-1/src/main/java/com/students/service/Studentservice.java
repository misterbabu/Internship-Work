package com.students.service;

import java.util.List;

import com.students.model.Student;

public interface Studentservice {
	
	List<Student> getStudents();
	Student getStudent(int id);
	void saveStudent(Student student);
	void deleteStudent(int id);

}
