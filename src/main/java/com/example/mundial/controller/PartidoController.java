package com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mundial.entities.Partido;
import com.example.mundial.entities.Resultado;
import com.example.mundial.repository.PartidoRepository;

@Controller
@RequestMapping
public class PartidoController {
	
	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping("/{id}/resultados")
	public List<Resultado> partidoResultado(@PathVariable Integer id){
		Optional<Partido> partido = partidoRepository.findById(id);
		if(partido.isPresent()) {
			return null;
		}
		return null;
	}

}
