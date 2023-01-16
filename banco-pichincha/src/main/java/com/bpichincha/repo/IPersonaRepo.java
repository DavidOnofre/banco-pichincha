package com.bpichincha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpichincha.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
