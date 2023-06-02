package com.example.mundial.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Continente implements Serializable {
	
	@Id
	@SequenceGenerator(name="continente_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "continente_id_seq")
	private String id;
	private String nombre;
	@JsonIgnore
	@OneToMany(mappedBy="continente")
	private List<Seleccion> selecciones;

}
