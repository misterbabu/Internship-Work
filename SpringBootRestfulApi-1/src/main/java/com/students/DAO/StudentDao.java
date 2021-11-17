package com.students.DAO;

import java.util.List;

import com.students.model.Student;

public interface StudentDao {
	List<Student> getStudents();
	Student getStudent(int id);
	void saveStudent(Student student);
	void deleteStudent(int id);

}
