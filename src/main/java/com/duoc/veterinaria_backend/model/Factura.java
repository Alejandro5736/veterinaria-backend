package com.duoc.veterinaria_backend.model;

import jakarta.persistence.*; // Nota: En versiones nuevas de Spring Boot se usa jakarta
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitaId;
    private String servicios;
    private String medicamentos;
    private Double cargosExtra;
    private Double total;
    private LocalDateTime fecha = LocalDateTime.now();

    // Constructores, Getters y Setters (o usa @Data si tienes Lombok)
    public Factura() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getVisitaId() { return visitaId; }
    public void setVisitaId(Long visitaId) { this.visitaId = visitaId; }
    public String getServicios() { return servicios; }
    public void setServicios(String servicios) { this.servicios = servicios; }
    public String getMedicamentos() { return medicamentos; }
    public void setMedicamentos(String medicamentos) { this.medicamentos = medicamentos; }
    public Double getCargosExtra() { return cargosExtra; }
    public void setCargosExtra(Double cargosExtra) { this.cargosExtra = cargosExtra; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}