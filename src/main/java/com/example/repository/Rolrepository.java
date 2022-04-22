package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Rol;
import com.example.enums.RolNombre;

@Repository
public interface Rolrepository extends JpaRepository<Rol, Integer> {

	Optional<Rol> findByRolNombre(RolNombre rolnombre);
}
