package com.example.mundial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.mundial.entities.Seleccion;


public interface SeleccionRepository extends JpaRepository<Seleccion,Integer>{
	public List<Seleccion>findByGrupo(String grupo);
}
