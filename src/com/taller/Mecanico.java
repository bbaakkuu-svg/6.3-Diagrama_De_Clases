package com.taller;

public class Mecanico implements Especialista {
    private String nombre;
    private String especialidad;

    public Mecanico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public void reparar(Vehiculo v) {
        System.out.println("El mecánico " + nombre + " (" + especialidad + ") está reparando el " + v.getModelo() + " con matrícula " + v.getMatricula());
    }
}
