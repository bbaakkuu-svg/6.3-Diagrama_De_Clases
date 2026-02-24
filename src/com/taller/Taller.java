package com.taller;

public class Taller {
    private String nombre;
    private Mecanico mecanicoAsignado;

    public Taller(String nombre, Mecanico mecanicoAsignado) {
        this.nombre = nombre;
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public void gestionarReparacion(Vehiculo v, String desc, double costo) {
        System.out.println("Iniciando gestión en el taller: " + nombre);
        mecanicoAsignado.reparar(v);
        v.addReparacion(desc, costo);
        System.out.println("Reparación finalizada y registrada.");
    }
}
