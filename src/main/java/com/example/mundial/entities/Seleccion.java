package com.example.mundial.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Seleccion implements Serializable {
	
	@Id
	@SequenceGenerator(name="seleccion_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seleccion_id_seq")
	private Integer id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="continente_id")
	private Continente continente;
	/**
	@JsonIgnore
	@OneToMany(mappedBy="seleccion")
	private List<Resultado> resultados;
	*/
	private String grupo;

	
	

}
