package xyz.cablemas.scoswebservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.cablemas.scoswebservice.entity.OrdenesDeServicio;

import xyz.cablemas.scoswebservice.service.OrdenesDeServicioService;

@RestController
@RequestMapping("/v1/orden")
public class OrdenesDeServicioController {
	
	@Autowired 
	private OrdenesDeServicioService ordenesDeServicioService;
	
	@GetMapping
	public ResponseEntity<Collection<OrdenesDeServicio>> getOrdenes() {
		return new ResponseEntity<Collection<OrdenesDeServicio>>(ordenesDeServicioService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{orden}")
	public ResponseEntity<OrdenesDeServicio> getOrdenById(@PathVariable(name = "orden") Long ordenId) {
		return new ResponseEntity<OrdenesDeServicio>(ordenesDeServicioService.findById(ordenId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> insertOrden(@RequestBody OrdenesDeServicio orden) {
		ordenesDeServicioService.save(orden);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@PutMapping("/{ordenId}")
	public ResponseEntity<HttpStatus> updateOrden(@RequestBody OrdenesDeServicio orden,
			@PathVariable(name = "ordenId") Long ordenId) {
		ordenesDeServicioService.save(orden);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{ordenId}")
	public ResponseEntity<HttpStatus> deleteOrdenById(@PathVariable(name = "ordenId") Long ordenId) {
		ordenesDeServicioService.deleteById(ordenId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
