package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario inserta(Usuario obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<Usuario> listaUsuario() {
		
		return repository.findAll();
	}

	

}
