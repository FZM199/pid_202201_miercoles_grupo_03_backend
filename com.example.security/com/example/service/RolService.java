package com.example.service;

import java.util.Optional;

import com.example.entity.Rol;
import com.example.enums.RolNombre;

public interface RolService {
  
	public abstract Optional<Rol> findByRolNombre(RolNombre rolnombre);
}
