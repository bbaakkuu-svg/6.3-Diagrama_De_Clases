package com.taller;

public class Main {
    public static void main(String[] args) {
        // Inicialización del sistema
        Mecanico juan = new Mecanico("Juan Pérez", "Especialista en Motores");
        Taller miTaller = new Taller("Taller Antigravity", juan);

        // Cliente y vehículos
        Cliente cliente = new Cliente("12345678A", "Carlos Sánchez");
        Coche miCoche = new Coche("1234-ABC", "Toyota Corolla", 5);
        Moto miMoto = new Moto("5678-DEF", "Honda CB500", false);

        cliente.addVehiculo(miCoche);
        cliente.addVehiculo(miMoto);

        // Gestión de reparaciones
        System.out.println("--- Inicio de Jornada ---");
        miTaller.gestionarReparacion(miCoche, "Cambio de aceite", 80.0);
        miTaller.gestionarReparacion(miMoto, "Cambio de neumáticos", 120.0);

        System.out.println("\n--- Resumen de Facturación ---");
        // En una implementación real buscaríamos en el historial
        // Aquí mostramos el concepto de la Factura generada automáticamente
        System.out.println("Vehículo: " + miCoche.getMatricula());
        // Nota: En un sistema real accederíamos a la lista de reparaciones
    }
}
