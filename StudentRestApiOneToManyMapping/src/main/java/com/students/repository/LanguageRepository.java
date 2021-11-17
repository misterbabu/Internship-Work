package com.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.entity.Language;
@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
