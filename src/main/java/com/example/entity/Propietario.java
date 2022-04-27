
package com.example.entity;

import java.sql.Time;
import java.util.Date;
import java.util.Calendar;

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
	
	/*@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima")
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)*/
	@Basic(optional = false)
	private String horaregistro;
	
	@Basic(optional = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name ="idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name ="coddepartamento")
	private Departamento departamento;
	
	

	public int getCodpropietario() {
		return codpropietario;
	}

	public void setCodpropietario(int codpropietario) {
		this.codpropietario = codpropietario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerapellido() {
		return primerapellido;
	}

	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}

	public String getSegundoapellido() {
		return segundoapellido;
	}

	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getHoraregistro() {
		return horaregistro;
	}

	public void setHoraregistro(String horaregistro) {
		this.horaregistro = horaregistro;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	

	
	

}

