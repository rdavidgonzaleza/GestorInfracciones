package com.gestor.infracciones.gestorinfracciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.infracciones.gestorinfracciones.entity.Infraccion;
import com.gestor.infracciones.gestorinfracciones.service.InfraccionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class InfraccionController {
    private InfraccionService service;

    @Autowired
    @PostMapping("/addInfraccion")
    public Infraccion addInfraccion(@RequestBody Infraccion infraccion) {
        return service.saveInfraccion(infraccion);
    }
    
    @GetMapping("/infracciones")
    public List<Infraccion> findInfracciones() {
        return service.getInfraccion();
    }

    @PutMapping("updateInfraccion/{id}")
       public Infraccion updateInfraccion(@PathVariable int id, @RequestBody Infraccion infraccion) {
        
        return service.updateInfraccion(infraccion);
    }
}
