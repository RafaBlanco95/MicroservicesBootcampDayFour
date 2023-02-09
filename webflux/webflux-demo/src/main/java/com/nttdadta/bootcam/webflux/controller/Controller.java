package com.nttdadta.bootcam.webflux.controller;

import java.time.Duration;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdadta.bootcam.webflux.repository.Subscriber;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class Controller {

	@GetMapping(path="/numbers", produces="text/event-stream")
	public Flux<Integer> numbers(){
		
		Flux<Integer>flux=Flux.range(1,30).delayElements(Duration.ofSeconds(1));
		
		return flux;
		
	}
	@GetMapping(path="/numbers-with-subscribers", produces="text/event-stream")
	public Flux<Integer> numberWithSubscribers(){
		Flux<Integer>flux=Flux.range(1,30).delayElements(Duration.ofSeconds(1));
		flux.subscribe(n-> Subscriber.print(n));
		flux.subscribe(n-> System.out.println("Subscriber 2: " + n));
		
		return flux;
	}
}
