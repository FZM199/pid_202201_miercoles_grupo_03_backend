package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ubigeo;
import com.example.entity.Usuario;
import com.example.service.UbigeoService;
import com.example.service.UsuarioService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilsController {
	
	@Autowired
	private UbigeoService ubigeoService;
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/listaDepartamentos")
	@ResponseBody
	public List<String> listaDepartamentos() {
		return ubigeoService.listaDepartamentos();
	}

	@GetMapping("/listaProvincias/{paramDep}")
	@ResponseBody
	public List<String> listaProvincias(@PathVariable("paramDep") String dep) {
		return ubigeoService.listaProvincias(dep);
	}

	@GetMapping("/listaDistritos/{paramDep}/{paramProv}")
	@ResponseBody
	public List<Ubigeo> listaDistritos(@PathVariable("paramDep") String dep, @PathVariable("paramProv") String prov) {
		return ubigeoService.listaDistritos(dep, prov);
	}
	@GetMapping("/listausuarios")
	@ResponseBody
	public List<Usuario> listausuarios(){
		return usuarioService.listaUsuario();
	}

}
