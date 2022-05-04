
package com.example.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "propietario")
public class Propietario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int codpropietario;
	
	@Basic(optional = false)
	@Column(length = 8)
	private int dni;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String nombre;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String primerapellido;
	
	@Basic(optional = false)
	@Column( length = 200)
	private String segundoapellido;
	
	@Basic(optional = false)
	private String telefono;
	
	@Basic(optional = false)
	private String celular;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	private Date fecharegistro;
	
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima")
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	private Date horaregistro;
	
	@Basic(optional = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name ="idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name ="coddepartamento")
	private Departamento departamento;
	
}

