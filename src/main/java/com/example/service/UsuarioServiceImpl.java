package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Optional<Usuario> findbyNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return repo.findbyNombreUsuario(nombreUsuario);
	}

	@Override
	public boolean exitsByNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return repo.exitsByNombreUsuario(nombreUsuario);
	}

	@Override
	public boolean exitsByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.exitsByEmail(email);
	}


}
