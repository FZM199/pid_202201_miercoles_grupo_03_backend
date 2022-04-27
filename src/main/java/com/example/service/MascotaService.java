package com.example.service;

import java.util.List;

import com.example.entity.Mascota;

public interface MascotaService {

	public abstract Mascota insertaActualiza(Mascota obj);
	
	public abstract List<Mascota> listaMascota();
}
