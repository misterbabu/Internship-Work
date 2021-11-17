package com.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.Language;
import com.students.repository.LanguageRepository;

@Service
public class LanuageService {
	@Autowired
	private LanguageRepository languageRepo;
	public Language addOrUpdate(Language language)
	{
		return languageRepo.save(language);
	}
	public boolean deleteById(int id)
	{
		languageRepo.deleteById(id);
		return true;
	}
	public List<Language> getAll()
	{
		return languageRepo.findAll();
	}
	public Language getById(int id)
	{
		return languageRepo.findById(id).get();
	}
}
