package com.taller;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta que representa un vehículo genérico
public abstract class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Reparacion> reparaciones; // Lista de reparaciones del vehículo

    // Constructor para inicializar el vehículo
    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.reparaciones = new ArrayList<>();
    }

    // Método para obtener la matrícula
    public String getMatricula() {
        return matricula;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;
    }

    // Método para añadir una reparación a la lista
    public void addReparacion(String descripcion, double costo) {
        Reparacion nuevaReparacion = new Reparacion(descripcion, costo);
        this.reparaciones.add(nuevaReparacion);
    }

    @Override
    public String toString() {
        return "Vehiculo con matrícula: " + matricula + " y modelo: " + modelo;
    }
}
