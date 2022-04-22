package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coddepartamento;    //        int       not null    primary key,
	private String numdepartamento;   //         char(3)       not null,
	private Date fechaentrega;       //        date          not null,
	private double precio;   //           decimal(8,2)   not null
	@ManyToOne
	@JoinColumn(name = "codedificio")
	private Edificio codedificio;    //              int           not null,
	@ManyToOne
	@JoinColumn(name = "codpropietario")
    private Propietario	codpropietario;         //    int                not null
	public int getCoddepartamento() {
		return coddepartamento;
	}
	public void setCoddepartamento(int coddepartamento) {
		this.coddepartamento = coddepartamento;
	}
	public String getNumdepartamento() {
		return numdepartamento;
	}
	public void setNumdepartamento(String numdepartamento) {
		this.numdepartamento = numdepartamento;
	}
	public Date getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Edificio getCodedificio() {
		return codedificio;
	}
	public void setCodedificio(Edificio codedificio) {
		this.codedificio = codedificio;
	}
	public Propietario getCodpropietario() {
		return codpropietario;
	}
	public void setCodpropietario(Propietario codpropietario) {
		this.codpropietario = codpropietario;
	}
	
	
}
