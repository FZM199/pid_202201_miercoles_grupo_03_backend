package com.example.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "codpropietario")
	private int cod_propietario;
	
	@Basic(optional = false)
	@Column(name = "dni",length = 8)
	private int dni_propietario;
	
	@Basic(optional = false)
	@Column(name = "nombre",length = 200)
	private String nombre_propietario;
	
	@Basic(optional = false)
	@Column(name = "primerapellido",length = 200)
	private String primerapellido_propietario;
	
	@Basic(optional = false)
	@Column( name = "segundoapellido",length = 200)
	private String segundoapellido_propietario;
	
	@Basic(optional = false)
	@Column(name = "telefono")
	private String telefono_propietario;
	
	
	@Basic(optional = false)
	@Column(name = "celular")
	private String celular_propietario;
	
	
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	@Column(name = "fecharegistro")
	private Date fecharegistro_propietario;
	
	
	@Basic(optional = false)
	@Column(name = "estado")
	private boolean estado_propietario;




	public int getCod_propietario() {
		return cod_propietario;
	}


	public void setCod_propietario(int cod_propietario) {
		this.cod_propietario = cod_propietario;
	}


	public int getDni_propietario() {
		return dni_propietario;
	}


	public void setDni_propietario(int dni_propietario) {
		this.dni_propietario = dni_propietario;
	}


	public String getNombre_propietario() {
		return nombre_propietario;
	}


	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}


	public String getPrimerapellido_propietario() {
		return primerapellido_propietario;
	}


	public void setPrimerapellido_propietario(String primerapellido_propietario) {
		this.primerapellido_propietario = primerapellido_propietario;
	}


	public String getSegundoapellido_propietario() {
		return segundoapellido_propietario;
	}


	public void setSegundoapellido_propietario(String segundoapellido_propietario) {
		this.segundoapellido_propietario = segundoapellido_propietario;
	}


	public String getTelefono_propietario() {
		return telefono_propietario;
	}


	public void setTelefono_propietario(String telefono_propietario) {
		this.telefono_propietario = telefono_propietario;
	}


	public String getCelular_propietario() {
		return celular_propietario;
	}


	public void setCelular_propietario(String celular_propietario) {
		this.celular_propietario = celular_propietario;
	}


	public Date getFecharegistro_propietario() {
		return fecharegistro_propietario;
	}


	public void setFecharegistro_propietario(Date fecharegistro_propietario) {
		this.fecharegistro_propietario = fecharegistro_propietario;
	}


	public boolean isEstado_propietario() {
		return estado_propietario;
	}


	public void setEstado_propietario(boolean estado_propietario) {
		this.estado_propietario = estado_propietario;
	}

	

	

	
	

}
