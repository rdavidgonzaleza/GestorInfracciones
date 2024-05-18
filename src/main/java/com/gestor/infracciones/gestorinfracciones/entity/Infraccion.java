package com.gestor.infracciones.gestorinfracciones.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "infraccion")

public class Infraccion {
    private int infraccionId;
    private int infractorId;
    private String motivoInfraccion;
    private double valorInfraccion;
    private LocalDateTime fechaAsignacion;
    private LocalDateTime fechaLimitePago;
    private String direccion;
    private String estado;
    private int pagos;
    private String urlEvidencia;
}