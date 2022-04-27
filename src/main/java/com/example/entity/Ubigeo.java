package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "ubigeo")
public class Ubigeo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUbigeo")
	private int idUbigeo;
	@Column(name="departamento")
	private String departamento;
	@Column(name="provincia")
	private String provincia;
	@Column(name="distrito")
	private String distrito;

}