package com.nttdata.bootcamp.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

	private String firstName;
	private String lastName;
	private int age;
}
