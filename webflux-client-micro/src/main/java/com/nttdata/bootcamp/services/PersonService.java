package com.nttdata.bootcamp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.repository.Persona;

import reactor.core.publisher.Flux;

@Service
public class PersonService {
	WebClient client1 = WebClient.create("http://localhost:8888/person-list-1");
	WebClient client2 = WebClient.create("http://localhost:8888/person-list-2");
	WebClient client3 = WebClient.create("http://localhost:8888/person-list-3");
	WebClient client4 = WebClient.create("http://localhost:8888/person-list-4");

	public Flux<Persona> allPersons() {
		
		return Flux.merge(client1.get().retrieve().bodyToFlux(Persona.class),
				client2.get().retrieve().bodyToFlux(Persona.class),
				client3.get().retrieve().bodyToFlux(Persona.class),
				client4.get().retrieve().bodyToFlux(Persona.class));
		
	}
}
