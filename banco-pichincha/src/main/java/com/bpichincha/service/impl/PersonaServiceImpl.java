package com.bpichincha.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpichincha.model.Persona;
import com.bpichincha.repo.IPersonaRepo;
import com.bpichincha.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;

	@Override
	public Persona registrar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona modificar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		Optional<Persona> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Persona();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
