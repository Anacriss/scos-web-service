package xyz.cablemas.scoswebservice.service.impl;

import java.util.Collection;

import xyz.cablemas.scoswebservice.entity.ConstanciaDeVisita;
import xyz.cablemas.scoswebservice.repository.ConstanciaDeVisitaRepository;
import xyz.cablemas.scoswebservice.service.ConstanciaDeVisitaService;

public class ConstanciaDeVisitaServiceImpl implements ConstanciaDeVisitaService {

	private ConstanciaDeVisitaRepository constanciaRepository;
	
	@Override
	public void save(ConstanciaDeVisita constancia) {
		
		constanciaRepository.save(constancia);
	}

	@Override
	public void deleteById(Long constanciaId) {
		
		constanciaRepository.deleteById(constanciaId);
		
	}

	@Override
	public Collection<ConstanciaDeVisita> findAll() {
		
		return constanciaRepository.findAll();
	}

	@Override
	public ConstanciaDeVisita findById(Long constanciaId) {
		
		return constanciaRepository.findById(constanciaId)
				.orElseThrow(() -> new RuntimeException("constancia with id: " + constanciaId + " is not found!"));
	}

}
