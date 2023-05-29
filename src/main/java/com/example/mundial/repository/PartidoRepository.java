package com.example.mundial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mundial.entities.Partido;

public interface PartidoRepository extends JpaRepository<Partido,Integer> {

}
