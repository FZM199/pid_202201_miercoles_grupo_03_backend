package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.enums.RolNombre;
@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private RolNombre RolNombre;
	
	public Rol() {
		
	}

	public Rol(RolNombre rolNombre) {
		super();
		RolNombre = rolNombre;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public RolNombre getRolNombre() {
		return RolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		RolNombre = rolNombre;
	}
	
	
}
