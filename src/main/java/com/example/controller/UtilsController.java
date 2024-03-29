package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Edificio;
import com.example.entity.Mascota;
import com.example.entity.Propietario;
//import com.example.entity.Propietario;
import com.example.entity.Usuario;
import com.example.service.EdificioService;
import com.example.service.MascotaService;
//import com.example.service.PropietarioService;
import com.example.service.PropietarioService;
import com.example.entity.Ubigeo;

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
	
	@Autowired
	private EdificioService edificioService;
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private MascotaService mascotaService;
	
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
	
	@GetMapping("/listapropietarios")
	@ResponseBody
	public ResponseEntity<List<Propietario>> listaPropietario(){
		List<Propietario> lista = propietarioService.listaPropietario();
		return ResponseEntity.ok(lista);
	}
	@GetMapping("/listamascota")
	@ResponseBody
	public ResponseEntity<List<Mascota>> listar(){
		List<Mascota> lista = mascotaService.listaMascota();
		return ResponseEntity.ok(lista);
	}

	
	
	//  Combo Box Usuario para Formulario Departamento 
	@GetMapping("/usuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario(){
		List<Usuario> listau = usuarioService.listaUsuario();
		return ResponseEntity.ok(listau);
	}
	
//  Combo Box Edificio para Formulario Departamento 
	@GetMapping("/edificio")
	@ResponseBody
	public ResponseEntity<List<Edificio>> listaEdificio(){
		List<Edificio> listae = edificioService.listaEdificio();
		return ResponseEntity.ok(listae);
	}
	

	
}
