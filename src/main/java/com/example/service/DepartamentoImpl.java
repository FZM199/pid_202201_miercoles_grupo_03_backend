package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Departamento;
import com.example.repository.DepartamentoRepository;

@Service
public class DepartamentoImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoRepository repository;
	
	@Override
	public Departamento insertaActualiza(Departamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<Departamento> listaDepartamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
