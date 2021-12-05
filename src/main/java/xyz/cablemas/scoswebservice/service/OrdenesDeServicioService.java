package xyz.cablemas.scoswebservice.service;

import java.util.Collection;

import xyz.cablemas.scoswebservice.entity.OrdenesDeServicio;

public interface OrdenesDeServicioService {

	void save(OrdenesDeServicio orden);

	void deleteById(Long id);

	Collection<OrdenesDeServicio> findAll();

	OrdenesDeServicio findById(Long id);
}
