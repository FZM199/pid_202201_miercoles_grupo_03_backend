package com.example.entity;


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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.ToString;

@Getter
@Entity
@Table(name="Usuario")
@ToString
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;                //    int                          primary key,
 	private String dni;                 //       char(8)       not null       unique,
	private String nombre;             //        varchar(30)   not null,
	private String correo;              //       varchar(50)   not null,
	private String login;
	private String password;          //       char(8)       not null,
	private String primerapellido;     //        varchar(30)   not null,
	private String segundoapellido;    //        varchar(30)   not null,
	private String telefono;            //       char(7)       not null,
	private String celular;            //        char(9)       not null,
	private String direccion;          //        varchar(1000) not null,
	private int    tipousuario;              //  int           not null,
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private String   fechareg;            // date          not null,
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUbigeo")
	private Ubigeo   codubigeo;             //     int           not null,
    
	public String getNombreCompleto() {
		return nombre.concat(" ").concat(primerapellido+segundoapellido);
	}
	
}
