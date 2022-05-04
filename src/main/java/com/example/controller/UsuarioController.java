package com.example.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.utils.Constantes;

import com.example.entity.Usuario;
import com.example.service.UsuarioService;

@RestController
@RequestMapping("/rest/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping("/listausuarios")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario(){
		List<Usuario> listau = usuarioservice.listaUsuario();
		return ResponseEntity.ok(listau);
	}
    
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaUsuario(@RequestBody Usuario obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			obj.setEstado(true);
			Usuario objSalida = usuarioservice.insertaActualizaUsuario(obj);
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
