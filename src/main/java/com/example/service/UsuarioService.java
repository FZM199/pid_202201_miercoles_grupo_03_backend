package com.example.service;

import java.util.List;


import com.example.entity.Usuario;


import com.example.entity.Opcion;
import com.example.entity.Rol;



public interface UsuarioService {
	
	

	public abstract List<Usuario> listaUsuario();
	public abstract Usuario insertaActualizaUsuario(Usuario u);
	

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);
	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);
	public abstract Usuario buscaPorLogin(String login);
	

	public abstract Usuario inserta(Usuario obj);

}
