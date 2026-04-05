package com.duoc.veterinaria_backend.controller;

import com.duoc.veterinaria_backend.model.Factura;
import com.duoc.veterinaria_backend.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    // Endpoint para crear una factura (Privado)
    @PostMapping("/crear")
    public Factura crearFactura(@RequestBody Factura factura) {
        return facturaService.generarFactura(factura);
    }

    // Endpoint para ver todas las facturas (Privado)
    @GetMapping("/listar")
    public List<Factura> listarFacturas() {
        return facturaService.obtenerTodas();
    }
}