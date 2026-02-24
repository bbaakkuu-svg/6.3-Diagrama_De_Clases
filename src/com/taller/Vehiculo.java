package com.taller;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Reparacion> reparaciones;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.reparaciones = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void addReparacion(String descripcion, double costo) {
        // Composición: El objeto Reparacion se crea dentro de Vehiculo
        this.reparaciones.add(new Reparacion(descripcion, costo));
    }

    @Override
    public String toString() {
        return "Vehiculo [" + matricula + ", " + modelo + "]";
    }
}
