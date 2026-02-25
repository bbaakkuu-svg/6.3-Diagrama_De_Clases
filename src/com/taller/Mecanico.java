package com.taller;

// Clase que representa a un mecánico que trabaja en el taller
public class Mecanico implements Especialista {
    private String nombre;
    private String especialidad;

    // Constructor del mecánico
    public Mecanico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Implementación del método reparar de la interfaz Especialista
    @Override
    public void reparar(Vehiculo v) {
        System.out.println("El mecánico " + nombre + " está arreglando el " + v.getModelo());
    }
}
