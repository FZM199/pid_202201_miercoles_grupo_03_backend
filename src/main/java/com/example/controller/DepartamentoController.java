package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Departamento;
import com.example.service.DepartamentoService;

@RestController
@RequestMapping("/rest/departamento")
public class DepartamentoController {

	@Autowired
	private DepartamentoService service;
	
	@GetMapping
	@ResponseBody // --> Significa que me va retornar datos en Json
	public ResponseEntity<List<Departamento>> listar(){
		List<Departamento> lista = service.listaDepartamento();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody // ---> @RequestBody Va recibir datos en formato Json
	public ResponseEntity<Departamento> inserta(@RequestBody  Departamento obj){
		Departamento objSalida = service.insertaActualiza(obj);
		return ResponseEntity.ok(objSalida);
	}
	
}
