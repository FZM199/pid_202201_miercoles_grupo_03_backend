package com.example.entity;


import java.util.Date;

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
	@Column(name="idUsuario")
	private int idUsuario;                //    int                          primary key,
	@Column(name="dni")
 	private String dni;                 //       char(8)       not null       unique,
	@Column(name="nombre")
	private String nombre;             //        varchar(30)   not null,
	@Column(name="correo")
	private String correo;              //       varchar(50)   not null,
	@Column(name="login")
	private String login;
	@Column(name="password")
	private String password;          //       char(8)       not null,
	@Column(name="primerapellido")
	private String primerapellido;     //        varchar(30)   not null,
	@Column(name="segundoapellido")
	private String segundoapellido;    //        varchar(30)   not null,
	@Column(name="telefono")
	private String telefono;            //       char(7)       not null,
	@Column(name="celular")
	private String celular;            //        char(9)       not null,
	@Column(name="direccion")
	private String direccion;          //        varchar(1000) not null,
	@Column(name="estado")
	private int    estado;              //  int           not null,
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date   fechareg;            // date          not null,
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUbigeo")
	private Ubigeo   idUbigeo;          
    @Transactional
	public String getNombreCompleto() {
		return nombre.concat(" ").concat(primerapellido+segundoapellido);
	}
	
}