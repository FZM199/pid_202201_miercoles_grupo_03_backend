package com.example.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="Usuario")
@ToString
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idUsuario")
	private int idUsuario;
	
	@Basic(optional = false)
	@Column(length = 8)
	private String dni;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String nombre;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String primerapellido;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String segundoapellido;
	
	@Basic(optional = false)
	private String telefono;
	
	@Basic(optional = false)
	private String celular;
	
	@Basic(optional = false)
	@Column(length = 1000)
	private String direccion;
	
	@Basic(optional = false)
	@Column(length = 200)
	private String correo;
	
	@Basic(optional = false)
	@Column(length = 10000)
	private String password;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	private Date fechareg;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idubigeo")
	@Basic(optional = false)
	private Ubigeo idUbigeo;
	
	@Basic(optional = false)
	private String login;
	
	@Basic(optional = false)
	private boolean estado;
  
	@Transactional
	public String getNombreCompleto() {
		return nombre.concat(" ").concat(primerapellido+segundoapellido);
	}
	
}
	
