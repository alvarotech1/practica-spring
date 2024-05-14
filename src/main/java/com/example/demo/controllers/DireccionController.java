package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Direccion;
import com.example.demo.repository.DireccionRepository;

@RestController
public class DireccionController {

	@Autowired
	private DireccionRepository repo;
	
	@GetMapping("/direcciones")
	public List<Direccion> getDirecciones()
	{
		return repo.findAll();
	}
	
	@GetMapping("/direcciones/{id}")
	public Optional<Direccion> getDireccionId(@PathVariable Long id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("/direcciones")
	public Direccion saveDireccion(@RequestBody Direccion direccion)
	{
		return repo.save(direccion);
	}
	
	@DeleteMapping("/direcciones/{id}")
	public void deleteDireccion (@PathVariable Long id)
	{
		repo.deleteById(id);
	}
	
	@DeleteMapping("/direcciones")
	public void deleteAllDirecciones()
	{
		repo.deleteAll();
	}
}
