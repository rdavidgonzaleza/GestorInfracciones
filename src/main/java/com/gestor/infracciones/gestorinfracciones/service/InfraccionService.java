package com.gestor.infracciones.gestorinfracciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.infracciones.gestorinfracciones.entity.Infraccion;
import com.gestor.infracciones.gestorinfracciones.repository.InfraccionRepository;

@Service
public class InfraccionService {
    private InfraccionRepository repository;

    @Autowired
    public List<Infraccion> getInfraccion(){
        return repository.findAll();
    }

    @Autowired
    public Infraccion saveInfraccion(Infraccion infraccion){
        return repository.save(infraccion);
    }

    @Autowired
    public Infraccion updateInfraccion(Infraccion infraccion){
        Infraccion existingInfraccion = repository.findById(infraccion.getInfraccionId()).orElse(null);
        if (existingInfraccion!=null) {
            existingInfraccion.setEstado(infraccion.getEstado());
            existingInfraccion.setFechaLimitePago(infraccion.getFechaLimitePago());
            existingInfraccion.setPagos(infraccion.getPagos());
            return repository.save(existingInfraccion);
        }
        return null;
    }
}
