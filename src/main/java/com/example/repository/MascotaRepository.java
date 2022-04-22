package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Integer>{

}
