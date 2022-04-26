package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Mascota;
import com.example.repository.MascotaRepository;

@Service
public class MascotaImpl implements MascotaService{
	
	@Autowired
	private MascotaRepository repository;
	
	@Override
	public Mascota insertaActualiza(Mascota obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<Mascota> listaMascota() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
