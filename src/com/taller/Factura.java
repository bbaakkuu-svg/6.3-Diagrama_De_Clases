package com.taller;

import java.util.UUID;

public class Factura {
    private String numeroFactura;
    private double baseImponible;
    private double totalConIVA;

    public Factura(double baseImponible) {
        this.numeroFactura = "FAC-" + UUID.randomUUID().toString().substring(0, 8);
        this.baseImponible = baseImponible;
        this.totalConIVA = calcularTotal();
    }

    public double calcularTotal() {
        return baseImponible * 1.21;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public double getTotalConIVA() {
        return totalConIVA;
    }
}
