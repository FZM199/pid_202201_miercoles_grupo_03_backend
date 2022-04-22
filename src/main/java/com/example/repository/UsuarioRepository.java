package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

   Optional<Usuario> findbyNombreUsuario(String nombreUsuario);
   boolean exitsByNombreUsuario(String nombreUsuario);
   boolean exitsByEmail(String email);
   
}
