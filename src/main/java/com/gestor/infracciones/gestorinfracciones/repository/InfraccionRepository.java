package com.gestor.infracciones.gestorinfracciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestor.infracciones.gestorinfracciones.entity.Infraccion;

public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{
    Infraccion findByInfraccion(int id);
}
