package com.example.service;

import java.util.List;

import com.example.entity.Propietario;



public interface PropietarioService {
	
	public abstract List<Propietario> listaPropietario();

	public abstract Propietario insertaActualizaPropietario(Propietario obj);
	
	public abstract Propietario EliminarCambiarEstadoPropietario(Propietario obj);

}
