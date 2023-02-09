package com.nttdata.bootcamp.repository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Persona {

	private String firstName;
	private String lastName;
	private int age;
}
