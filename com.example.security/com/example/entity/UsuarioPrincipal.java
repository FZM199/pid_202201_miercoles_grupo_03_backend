package com.example.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre; 
	private String correo;
	private String nombreusuario;
	private String contraseña;          //       char(8)       not null,	
	private Collection<? extends GrantedAuthority> authorities;


	public UsuarioPrincipal(String nombre, String correo, String nombreusuario, String contraseña,
			Collection<? extends GrantedAuthority> authorities) {
		this.nombre = nombre;
		this.correo = correo;
		this.nombreusuario = nombreusuario;
		this.contraseña = contraseña;
		this.authorities = authorities;
	}


	public static UsuarioPrincipal build(Usuario u) {
		List<GrantedAuthority> authorities = 
	u.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());			
	
	return new UsuarioPrincipal(u.getNombre(),u.getCorreo(),u.getNombreusuario(),u.getContraseña(),authorities);
	}

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return contraseña;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return nombreusuario;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}

	
	
}
