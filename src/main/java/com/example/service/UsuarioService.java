package com.example.service;

import java.util.List;

import com.example.entity.Usuario;


public interface UsuarioService {

	public abstract Usuario inserta(Usuario obj);
	
	public abstract List<Usuario> listaUsuario();
}
