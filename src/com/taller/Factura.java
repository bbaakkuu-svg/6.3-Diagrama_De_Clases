package com.taller;

// Clase que representa una factura de reparación
public class Factura {
    private String numeroFactura;
    private double baseImponible;
    private double totalConIVA;

    public Factura(double baseImponible) {
        // Generamos un número de factura simple (un número aleatorio)
        this.numeroFactura = "FACT-" + (int) (Math.random() * 10000);
        this.baseImponible = baseImponible;
        this.totalConIVA = calcularTotal();
    }

    // Método para calcular el total con el 21% de IVA
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
