package com.example.mundial.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Resultado implements Serializable {
	
	@Id
	@SequenceGenerator(name="resultado_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "resultado_id_seq")
	private Integer id;	
	@ManyToOne
	@JoinColumn(name="partido_id")
	private Partido partido;
	@ManyToOne
	@JoinColumn(name="seleccion_id")
	private Seleccion seleccion;
	private Integer goles;
	private Integer amarillas;
	private Integer rojas;
	
}
