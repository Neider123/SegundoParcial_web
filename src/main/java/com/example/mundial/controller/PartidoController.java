package com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundial.entities.Partido;
import com.example.mundial.entities.Resultado;
import com.example.mundial.entities.Seleccion;
import com.example.mundial.repository.PartidoRepository;

@Controller
@RequestMapping("/partidos")
public class PartidoController {
	
	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping("/{id}/Verresultados")
	public List<Resultado> partidoResultado(@PathVariable Integer id){
		Optional<Partido> partido = partidoRepository.findById(id);
		if(partido.isPresent()) {
			return partido.get().getResultados();
		}
		return null;
	}
	
	
	@GetMapping("/{id}/resultados")
	public String verResultados(@PathVariable Integer id,Model model) {
		Optional<Partido> partido = partidoRepository.findById(id);
		model.addAttribute("resultados",partido.get().getResultados());
		return "Resultados";
		
	}

}
