package com.example.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Opcion;
import com.example.entity.Rol;
import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;



@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {


	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public List<Usuario> listaUsuario() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Usuario insertaActualizaUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}

	@Override
	public List<Opcion> traerEnlacesDeUsuario(int idUsuario) {
		return repo.traerEnlacesDeUsuario(idUsuario);
	}

	@Override
	public List<Rol> traerRolesDeUsuario(int idUsuario) {
		return repo.traerRolesDeUsuario(idUsuario);
	}

	@Override
	public Usuario buscaPorLogin(String login) {
		return repo.findByLogin(login);
	}

}
