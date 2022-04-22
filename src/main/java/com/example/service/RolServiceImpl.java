package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Rol;
import com.example.enums.RolNombre;
import com.example.repository.Rolrepository;

@Service
@Transactional
public class RolServiceImpl implements RolService{
	
	@Autowired
	private Rolrepository repo;

	@Override
	public Optional<Rol> findByRolNombre(RolNombre rolnombre) {
		// TODO Auto-generated method stub
		return repo.findByRolNombre(rolnombre);
	}

	
}
