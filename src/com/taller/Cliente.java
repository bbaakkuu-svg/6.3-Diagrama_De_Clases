package com.taller;

import java.util.ArrayList;
import java.util.List;

// Clase que representa a un cliente del taller
public class Cliente {
    private String dni;
    private String nombre;
    private List<Vehiculo> misVehiculos; // Lista de coches/motos del cliente

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.misVehiculos = new ArrayList<>();
    }

    // Método para añadir un vehículo al cliente
    public void añadirVehiculo(Vehiculo v) {
        this.misVehiculos.add(v);
    }

    // Getter para la lista de vehículos
    public List<Vehiculo> getVehiculos() {
        return misVehiculos;
    }
}
