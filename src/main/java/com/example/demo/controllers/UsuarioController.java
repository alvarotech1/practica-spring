package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository repo;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios()
	{
		return repo.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Optional<Usuario> getUsuarioId(@PathVariable Long id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("/usuarios")
	public Usuario saveUser(@RequestBody Usuario user)
	{
		return repo.save(user);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void deleteUser(@PathVariable Long id)
	{
		repo.deleteById(id);
	}
	
	@DeleteMapping("/usuarios")
	public void deleteAllUsers()
	{
		repo.deleteAll();
	}

}
