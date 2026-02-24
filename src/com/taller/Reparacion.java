package com.taller;

import java.time.LocalDate;

public class Reparacion {
    private String descripcion;
    private double costo;
    private LocalDate fecha;
    private Factura factura;

    public Reparacion(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.fecha = LocalDate.now();
        // Al crearse la reparación, se genera una factura (Fase 4: Extensión)
        this.factura = new Factura(costo);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public Factura getFactura() {
        return factura;
    }
}
