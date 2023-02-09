package com.nttdata.bootcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.repository.Persona;
import com.nttdata.bootcamp.services.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class PersonnListController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		
		final Flux<Persona> personlist=personService.allPersons();
		model.addAttribute("personlist",personlist);
		return "personList";
	}
}
