package com.gestor.infracciones.gestorinfracciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.infracciones.gestorinfracciones.entity.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    Persona findByNombres(String nombres);
    
}
