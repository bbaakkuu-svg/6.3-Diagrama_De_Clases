package com.taller;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String matricula, String modelo, boolean tieneSidecar) {
        super(matricula, modelo);
        this.tieneSidecar = tieneSidecar;
    }
}
