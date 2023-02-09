package com.nttdata.bootcamp.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.repository.Persona;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
	public Flux<Persona> personList1(){
		Flux<Persona>flux=Flux.just(new Persona("Rafael","Blanco",27),new Persona("Santiago", "López", 19)).delayElements(Duration.ofSeconds(1));
		return flux;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Persona> personList2(){
		Flux<Persona>flux=Flux.just(new Persona("Santiago","Montaño",30),new Persona("Paula", "Martínez", 27)).delayElements(Duration.ofSeconds(10));
		return flux;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Persona> personList3(){
		Flux<Persona>flux=Flux.just(new Persona("Pepito","Pérez",25),new Persona("Juan", "Muñoz", 20)).delayElements(Duration.ofSeconds(2));
		return flux;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Persona> personList4(){
		Flux<Persona>flux=Flux.just(new Persona("Francisco","Cuadrado",40),new Persona("Belén", "Aranda", 55)).delayElements(Duration.ofSeconds(4));
		return flux;
	}
}
