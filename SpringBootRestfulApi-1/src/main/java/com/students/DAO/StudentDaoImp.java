package com.students.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.students.model.Student;
@Repository
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Student> getStudents() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Student> query = currentSession.createQuery("from Student",Student.class);
		List<Student> list = query.getResultList();
		return list;
		
	}

	@Override
	public Student getStudent(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, id);
		return student;
		
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, id);
		currentSession.delete(student);
		
	}
	

}
