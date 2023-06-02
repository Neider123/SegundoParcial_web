package com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundial.entities.Partido;
import com.example.mundial.entities.Resultado;
import com.example.mundial.repository.ResultadoRepository;

@RestController
@RequestMapping("/selecciones")
public class ResultadoController {

	@Autowired
	ResultadoRepository resultadoRepository;
	
	
}
