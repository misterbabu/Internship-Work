package com.student.HibernateCrudOperation;

import java.util.List;

import com.student.HibernateCrudOperation.dao.StudentDao;
import com.student.HibernateCrudOperation.model.Student;

public class App 
{
    public static void main( String[] args )
    {
		
		  StudentDao studentDao = new StudentDao(); 
		  //Student student = new Student("Rohit","Java"); 
		  //studentDao.saveStudent(student);
		/* 
		 * student.setSname("Rohan"); studentDao.updateStudent(student);
		 */
		  Student student1 = studentDao.getStudentById(2);
		  System.out.println(student1);
		  
		 //List<Student> students = studentDao.getAllStudents();
		 //students.forEach(student2 -> System.out.println(student2));
		 
		 
		  //studentDao.deleteStudent(1);
		 
    }
}
