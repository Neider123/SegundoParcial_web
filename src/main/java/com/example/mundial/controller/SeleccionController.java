package com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundial.entities.Continente;
import com.example.mundial.entities.Seleccion;
import com.example.mundial.repository.ContinenteRepository;
import com.example.mundial.repository.SeleccionRepository;

@Controller
@RequestMapping
public class SeleccionController {
	
	@Autowired
	SeleccionRepository seleccionRepository;
	ContinenteRepository continenteRepository;
	
	// obtener todos los usuarios que estan en la base de datos.
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Seleccion> selecciones = seleccionRepository.findAll() ;
		model.addAttribute("selecciones",selecciones);
		return "index";
	}
	
	
	@GetMapping("/grupo/{grupo}")
	public String seleccionByGrupo(@PathVariable String grupo,Model model){
		List<Seleccion> selecciones = seleccionRepository.findByGrupo(grupo);
		model.addAttribute("selecciones",selecciones);
		return "index";
	}
    
	
	@GetMapping("/new")
	public String agregar(Model model) {
		Seleccion seleccion = new Seleccion();
		/**
		List<Continente> continentes = continenteRepository.findAll();
	    model.addAttribute("continentes", continentes);
	    */
	    model.addAttribute("seleccion",seleccion);
		return "NuevaSeleccion";
	}
	
	
	//@RequestMapping(value = "/categoria/guardar", method = RequestMethod.POST)
	@PostMapping("/guardar")
	public String guardarSeleccion(@ModelAttribute("seleccion") Seleccion seleccion) {
	    seleccionRepository.save(seleccion);
	    return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model model) {
		Optional<Seleccion> seleccion = seleccionRepository.findById(id);
		model.addAttribute("seleccion", seleccion);
		return "NuevaSeleccion";
		
	}
	
	//th:onclick="eliminar([[${categoria.id}]]
	@GetMapping("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		seleccionRepository.deleteById(id);
		return  "redirect:/listar";
		
	}
	
	
	@GetMapping("selecciones/{id}")
	public String categoriaById(@PathVariable Integer id,Model model) {
		Optional<Seleccion> seleccion = seleccionRepository.findById(id);
		model.addAttribute("selecciones",seleccion);
		return "index";
	}
	
	


	
	
	
	


}
