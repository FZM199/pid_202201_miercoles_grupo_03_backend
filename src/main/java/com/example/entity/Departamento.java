

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
@Table(name = "Departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "coddepartamento")
	private int cod_departamento;
	
	@Basic(optional = false)
	@Column(name = "numdepartamento", length = 3)
	private String num_departamento;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	@Column(name = "fechaentrega")
	private Date fecha_entrega;
	
	@Basic(optional = false)
	@Column(name = "precio")
	private Double precio;
	
	@Basic(optional = false)
	@Column(name = "nropiso")
	private int nro_piso;
	
	@Basic(optional = false)
	@Column(name = "codedificio")
	private int cod_edificio;
	
	@Basic(optional = false)
	@Column(name = "idUsuario")
	private int cod_usuario;

	
	public int getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public String getNum_departamento() {
		return num_departamento;
	}

	public void setNum_departamento(String num_departamento) {
		this.num_departamento = num_departamento;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getNro_piso() {
		return nro_piso;
	}

	public void setNro_piso(int nro_piso) {
		this.nro_piso = nro_piso;
	}

	public int getCod_edificio() {
		return cod_edificio;
	}

	public void setCod_edificio(int cod_edificio) {
		this.cod_edificio = cod_edificio;
	}


	public int getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
}

