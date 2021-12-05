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

import xyz.cablemas.scoswebservice.entity.ConstanciaDeVisita;

import xyz.cablemas.scoswebservice.service.ConstanciaDeVisitaService;

@RestController
@RequestMapping("/v1/constancia")
public class ConstanciaDeVisitaController {

	@Autowired 
	private ConstanciaDeVisitaService constanciaDeVisitaService;
	
	@GetMapping
	public ResponseEntity<Collection<ConstanciaDeVisita>> getConstancia() {
		return new ResponseEntity<Collection<ConstanciaDeVisita>>(constanciaDeVisitaService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{constancia}")
	public ResponseEntity<ConstanciaDeVisita> getOrdenById(@PathVariable(name = "constancia") Long constanciaId) {
		return new ResponseEntity<ConstanciaDeVisita>(constanciaDeVisitaService.findById(constanciaId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> insertconstancia(@RequestBody ConstanciaDeVisita constancia) {
		constanciaDeVisitaService.save(constancia);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@PutMapping("/{constanciaId}")
	public ResponseEntity<HttpStatus> updateConstancia(@RequestBody ConstanciaDeVisita constancia,
			@PathVariable(name = "constanciaId") Long constanciaId) {
		constanciaDeVisitaService.save(constancia);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{constanciaId}")
	public ResponseEntity<HttpStatus> deleteConstanciaById(@PathVariable(name = "constanciaId") Long constanciaId) {
		constanciaDeVisitaService.deleteById(constanciaId);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
}
