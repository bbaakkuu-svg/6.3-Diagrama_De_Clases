package com.taller;

// Clase que gestiona el taller y sus reparaciones
public class Taller {
    private String nombre;
    private Mecanico mecanico; // El mecánico que tiene el taller

    public Taller(String nombre, Mecanico mecanico) {
        this.nombre = nombre;
        this.mecanico = mecanico;
    }

    // Método para gestionar una reparación nueva
    public void gestionarReparacion(Vehiculo v, String descripcion, double costo) {
        System.out.println("Gestionando reparación en " + nombre);
        mecanico.reparar(v);
        v.addReparacion(descripcion, costo);
        System.out.println("La reparación se ha guardado correctamente.");
    }
}
