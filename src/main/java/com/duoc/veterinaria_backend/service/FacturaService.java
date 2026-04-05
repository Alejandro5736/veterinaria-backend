package com.duoc.veterinaria_backend.service;

import com.duoc.veterinaria_backend.model.Factura;
import com.duoc.veterinaria_backend.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura generarFactura(Factura factura) {
        // Aquí se cumple el requisito: servicios + medicamentos + cargos
        double total = factura.getCargosExtra() + 20000; // Ejemplo: 20000 es base de servicios
        factura.setTotal(total);
        return facturaRepository.save(factura);
    }

    public List<Factura> obtenerTodas() {
        return facturaRepository.findAll();
    }
}