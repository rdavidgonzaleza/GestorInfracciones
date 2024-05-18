package com.gestor.infracciones.gestorinfracciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.infracciones.gestorinfracciones.entity.Persona;
import com.gestor.infracciones.gestorinfracciones.service.PersonaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class PersonaController {
    private PersonaService service;

    @Autowired
    @PostMapping("/addPersona")
    public Persona addPersona(@RequestBody Persona persona) {
        return service.savePersona(persona);
    }
    
    @GetMapping("/personas")
    public List<Persona> findPersonas() {
        return service.getPersona();
    }
    
    @DeleteMapping("/delete/{id}")
    public void deletePersona(@PathVariable int id){
        service.deletePersona(id);
    }

    @PutMapping("updatePersona/{id}")
    public Persona updatePersona(@PathVariable int id, @RequestBody Persona persona) {
        return service.updatePersona(persona);
    }
}
