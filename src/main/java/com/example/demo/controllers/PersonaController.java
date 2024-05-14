package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonaController {

	@Autowired
	private PersonaRepository repo;
	
	@GetMapping("/personas")
	public List<Persona> getPersonas()
	{
		return repo.findAll();
	}
	
	@GetMapping("/personas/{id}")
	public Optional<Persona> getPersonaId(@PathVariable Long id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("/personas")
	public Persona savePersona(@RequestBody Persona persona)
	{
		return repo.save(persona);
	}
	
	@DeleteMapping("/personas/{id}")
	public void deletePersona (@PathVariable Long id)
	{
		repo.deleteById(id);
	}
	
	@DeleteMapping("/personas")
	public void deleteAllPersonas()
	{
		repo.deleteAll();
	}
}
