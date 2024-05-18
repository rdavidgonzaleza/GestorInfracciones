package com.gestor.infracciones.gestorinfracciones.entity;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")

public class Persona {
    private int documento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private LocalDateTime fechaNacimiento;
    private String telefono;
    private String correo;
    private String password;
}