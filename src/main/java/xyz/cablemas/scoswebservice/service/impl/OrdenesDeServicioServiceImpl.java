package xyz.cablemas.scoswebservice.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.cablemas.scoswebservice.entity.OrdenesDeServicio;
import xyz.cablemas.scoswebservice.repository.OrdenesDeServicioRepository;
import xyz.cablemas.scoswebservice.service.OrdenesDeServicioService;

@Service
public class OrdenesDeServicioServiceImpl implements OrdenesDeServicioService{

	@Autowired
	private OrdenesDeServicioRepository ordenesRepository;
	
	
	@Override
	public void save(OrdenesDeServicio orden) {
		ordenesRepository.save(orden);
		
	}

	@Override
	public void deleteById(Long id) {
		ordenesRepository.deleteById(id);
		
	}

	@Override
	public Collection<OrdenesDeServicio> findAll() {
		
		return ordenesRepository.findAll();
	}

	@Override
	public OrdenesDeServicio findById(Long id) {
		return ordenesRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("orden with id: " + id + " is not found!"));
	}

}
