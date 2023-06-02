package com.example.mundial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundial.entities.Continente;
import com.example.mundial.entities.Seleccion;
import com.example.mundial.repository.ContinenteRepository;

import jakarta.persistence.Entity;
import lombok.Data;

@RestController
@RequestMapping("/Continentes")
public class ContinenteController {
	
	
	@Autowired
	ContinenteRepository continenteRepository;
	
	
	@GetMapping("/listar")
	public List<Continente> getAllContinentes() {
		List<Continente> continentes = continenteRepository.findAll() ;	
		return continentes;
	}
	

}
