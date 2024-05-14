package com.example.demo.herencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;


@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public class Producto {

	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
}
