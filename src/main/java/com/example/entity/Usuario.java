package com.example.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codusua;                //    int                          primary key,
 	private String dni;                 //       char(8)       not null       unique,
	private String nombre;             //        varchar(30)   not null,
	private String primerapellido;     //        varchar(30)   not null,
	private String segundoapellido;    //        varchar(30)   not null,
	private String telefono;            //       char(7)       not null,
	private String celular;            //        char(9)       not null,
	private String direccion;          //        varchar(1000) not null,
	private String correo;              //       varchar(50)   not null,
	private String contraseña;          //       char(8)       not null,
	private int    tipousuario;              //  int           not null,
	@ManyToMany
	@JoinTable(name="usuario_has_rol",joinColumns = @JoinColumn(name="codusua"),
	inverseJoinColumns = @JoinColumn(name="idRol"))
	private  Set<Rol> roles=new HashSet<>();
	@Column(unique = true,nullable = false)
	private String nombreusuario;
	private String   fechareg;            // date          not null,
	@ManyToOne
	@JoinColumn(name = "idUbigeo")
	private Ubigeo   codubigeo;             //     int           not null,
    
	public Usuario() {
		
	}
	
	public Usuario(String dni, String nombre, String primerapellido, String segundoapellido, String telefono,
			String celular, String direccion, String correo, String contraseña, int tipousuario, String nombreusuario,
			String fechareg, Ubigeo codubigeo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.primerapellido = primerapellido;
		this.segundoapellido = segundoapellido;
		this.telefono = telefono;
		this.celular = celular;
		this.direccion = direccion;
		this.correo = correo;
		this.contraseña = contraseña;
		this.tipousuario = tipousuario;
		this.nombreusuario = nombreusuario;
		this.fechareg = fechareg;
		this.codubigeo = codubigeo;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public int getCodusua() {
		return codusua;
	}
	public void setCodusua(int codusua) {
		this.codusua = codusua;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getTipousuario() {
		return tipousuario;
	}
	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}
	public String getFechareg() {
		return fechareg;
	}
	public void setFechareg(String fechareg) {
		this.fechareg = fechareg;
	}
	public Ubigeo getCodubigeo() {
		return codubigeo;
	}
	public void setCodubigeo(Ubigeo codubigeo) {
		this.codubigeo = codubigeo;
	}
  	
}
