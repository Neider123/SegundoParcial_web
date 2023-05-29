package com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundial.entities.Seleccion;
import com.example.mundial.repository.SeleccionRepository;

@RestController
@RequestMapping
public class SeleccionController {
	
	@Autowired
	SeleccionRepository seleccionRepository;
	
	@GetMapping("/selecciones")
	public List<Seleccion> lista(){
		return seleccionRepository.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Seleccion> findSeleccionById(@PathVariable Integer id){
		Optional<Seleccion>seleccion=seleccionRepository.findById(id);
		if(seleccion.isPresent()) {
			return seleccion;
		}
		return null;
		
	}

	
	
	
	


}
