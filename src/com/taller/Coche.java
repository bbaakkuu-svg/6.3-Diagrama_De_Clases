package com.taller;

// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, String modelo, int numPuertas) {
        super(matricula, modelo); // Llamada al constructor padre
        this.numPuertas = numPuertas;
    }

    // Getter para el número de puertas
    public int getNumPuertas() {
        return numPuertas;
    }
}
