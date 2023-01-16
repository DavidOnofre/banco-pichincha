package com.bpichincha.service;

import java.util.List;

import com.bpichincha.model.Persona;

public interface IPersonaService {

	Persona registrar(Persona persona);

	Persona modificar(Persona persona);

	List<Persona> listar();

	Persona listarPorId(Integer id);

	void eliminar(Integer id);

}