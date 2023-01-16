package com.bpichincha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpichincha.model.Persona;
import com.bpichincha.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Persona listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Persona registrar(@RequestBody Persona persona) {
		return service.registrar(persona);
	}
	
	@PutMapping
	public Persona modificar(@RequestBody Persona persona) {
		return service.registrar(persona);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPorId(@PathVariable("id") Integer id) {
		 service.eliminar(id);
	}
		
}
