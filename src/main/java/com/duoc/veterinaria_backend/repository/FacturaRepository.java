package com.duoc.veterinaria_backend.repository; // Agregamos _backend

import com.duoc.veterinaria_backend.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}