package com.taller;

import java.time.LocalDate;

// Clase que guarda los datos de una reparación
public class Reparacion {
    private String descripcion;
    private double costo;
    private LocalDate fecha;
    private Factura factura; // Cada reparación tiene una factura asociada

    public Reparacion(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.fecha = LocalDate.now(); // Coge la fecha de hoy
        this.factura = new Factura(costo); // Creamos la factura aquí mismo
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
