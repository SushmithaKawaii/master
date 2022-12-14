package com.hibernate.demo.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.demo.dao.PersonDao;
import com.hibernate.demo.model.Person;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {
	
	@Autowired
	private PersonDao dao;
	
	@PostMapping("/savePerson")
	public String save(@RequestBody Person person) {
		dao.savePerson(person);
		
		return "success";
	}
	
	@GetMapping("/getAll")
	public Class<? extends Session> getAllPersons(){
		return dao.getPerson();
	}

}
