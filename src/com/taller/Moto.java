package com.taller;

// Clase Moto que hereda de Vehiculo
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String matricula, String modelo, boolean tieneSidecar) {
        super(matricula, modelo); // Llamada al constructor de Vehiculo
        this.tieneSidecar = tieneSidecar;
    }

    // Método para saber si tiene sidecar
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
}
