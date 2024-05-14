package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Persona {

	@ManyToMany(mappedBy = "personas")
	private Set<Direccion> direcciones;
	
	private String nombre;
	private String apellido;
	private int DNI;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
}
