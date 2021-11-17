package com.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.Language;
import com.students.service.LanuageService;

@RestController
@RequestMapping("/lang")
public class LanguageController {
	@Autowired
	LanuageService lanuageServ;
	@GetMapping
	private List<Language> getAll()
	{
		return lanuageServ.getAll();
	}
	@GetMapping("/{id}")
	private Language getById(@PathVariable int id)
	{
		return lanuageServ.getById(id);
	}
	@PostMapping
	private Language add(@RequestBody Language language)
	{
		return lanuageServ.addOrUpdate(language);	
	}
	@PutMapping("/{id}")
	private Language update(@PathVariable int id,@RequestBody Language language)
	{
		language.setLid(id);
		return lanuageServ.addOrUpdate(language);
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id)
	{
		lanuageServ.deleteById(id);
	}
	

}
