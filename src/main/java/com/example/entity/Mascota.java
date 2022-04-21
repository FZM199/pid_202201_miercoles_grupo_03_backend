package com.example.entity;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codmascota")
	private int cod_mascota;
	
	@Basic(optional = false)
	@Column(name = "nombremascota",length = 200)
	private String nombre_mascota;
	
	@Basic(optional = false)
	@Column(name = "edad")
	private int edad_mascota;
	
	@Basic(optional = false)
	@Column(name = "raza")
	private String raza_mascota;
	
	@Basic(optional = false)
	@Column(name = "tipo")
	private int tipo_mascota;
	
	@Basic(optional = false)
	@Column(name = "codpropietario")
	private int cod_propietario;
	
	

	public int getCod_mascota() {
		return cod_mascota;
	}

	public void setCod_mascota(int cod_mascota) {
		this.cod_mascota = cod_mascota;
	}

	public String getNombre_mascota() {
		return nombre_mascota;
	}

	public void setNombre_mascota(String nombre_mascota) {
		this.nombre_mascota = nombre_mascota;
	}

	public int getEdad_mascota() {
		return edad_mascota;
	}

	public void setEdad_mascota(int edad_mascota) {
		this.edad_mascota = edad_mascota;
	}

	public String getRaza_mascota() {
		return raza_mascota;
	}

	public void setRaza_mascota(String raza_mascota) {
		this.raza_mascota = raza_mascota;
	}

	public int getTipo_mascota() {
		return tipo_mascota;
	}

	public void setTipo_mascota(int tipo_mascota) {
		this.tipo_mascota = tipo_mascota;
	}

	public int getCod_propietario() {
		return cod_propietario;
	}

	public void setCod_propietario(int cod_propietario) {
		this.cod_propietario = cod_propietario;
	}
	
	
	
}
