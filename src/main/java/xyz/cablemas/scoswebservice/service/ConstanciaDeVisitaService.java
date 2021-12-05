package xyz.cablemas.scoswebservice.service;

import java.util.Collection;

import xyz.cablemas.scoswebservice.entity.ConstanciaDeVisita;

public interface ConstanciaDeVisitaService {

	void save(ConstanciaDeVisita constancia);

	void deleteById(Long constanciaId);

	Collection<ConstanciaDeVisita> findAll();

	ConstanciaDeVisita findById(Long constanciaId);
}
