package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Usuario;

public interface UsuarioService {

	public abstract List<Usuario> listaUsuario();
	public abstract Usuario insertaActualizaUsuario(Usuario u);
	public abstract Optional<Usuario> findbyNombreUsuario(String nombreUsuario);
	public abstract boolean exitsByNombreUsuario(String nombreUsuario);
	public abstract boolean exitsByEmail(String email);

}
