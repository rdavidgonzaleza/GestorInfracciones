package com.gestor.infracciones.gestorinfracciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.infracciones.gestorinfracciones.entity.Persona;
import com.gestor.infracciones.gestorinfracciones.repository.PersonaRepository;

@Service
public class PersonaService {
    private PersonaRepository repository;
    
    @Autowired
    public List<Persona> getPersona(){
        return repository.findAll();
    }

    @Autowired
    public Persona savePersona(Persona persona){
        return repository.save(persona);
    }

    @Autowired
    public void deletePersona(int id){
        repository.deleteById(id);   
    }

    @Autowired
    public Persona updatePersona(Persona persona){
        Persona existingPersona = repository.findById(persona.getDocumento()).orElse(null);
        if(existingPersona!=null){
            existingPersona.setTipoDocumento(persona.getTipoDocumento());
            existingPersona.setNombres(persona.getNombres());
            existingPersona.setApellidos(persona.getApellidos());
            existingPersona.setTelefono(persona.getTelefono());
            existingPersona.setCorreo(persona.getCorreo());
            existingPersona.setFechaNacimiento(persona.getFechaNacimiento());
            return repository.save(existingPersona);
        }
        return null;
    }
}
