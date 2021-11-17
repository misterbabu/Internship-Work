package com.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
