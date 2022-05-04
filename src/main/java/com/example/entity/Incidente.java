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

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Incidente")
public class Incidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codincidente")
	private int codincidente;     //           int         auto_increment  primary key, 
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima")
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	private Date hora;            //           time          not null,
	private String descripcion;             //   varchar(1000) not null,
	private boolean estado;      //        boolean default true,
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	private Date fechaAtencion;    //          date    
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)     
	private Date fechaRegistro;          //    date          not null,
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	@Basic(optional = false)
	private Usuario idUsuario;                 //    int           not null,
}
