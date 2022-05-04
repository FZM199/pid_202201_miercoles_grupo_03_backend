package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Edificio;
import com.example.service.EdificioService;
import com.example.utils.Constantes;

@RestController
@RequestMapping("/rest/edificio")
@CrossOrigin(origins = "http://localhost:4200")
public class EdificioController {

	@Autowired
	private EdificioService edificioService;
	
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaEdificio(@RequestBody Edificio obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			
			Edificio objSalida = edificioService.inserta(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	
}
