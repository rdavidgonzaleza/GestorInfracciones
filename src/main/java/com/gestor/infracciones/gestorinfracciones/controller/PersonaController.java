package com.gestor.infracciones.gestorinfracciones.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.gestor.infracciones.gestorinfracciones.entity.Persona;
import com.gestor.infracciones.gestorinfracciones.service.PersonaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class PersonaController {
    private PersonaService service;
    
    @GetMapping("/personas")
    public List<Persona> findPersonas() {
        return service.getPersona();
    }

    @PutMapping("updatePersona/{id}")
    public Persona updatePersona(@PathVariable int id, @RequestBody Persona persona) {
        return service.updatePersona(persona);
    }
}
