package com.mycompany.app;

public class Habitacion {
    private int numeroHabitacion;
    private double precio;

    public Habitacion(int numeroHabitacion, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.precio = precio;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getPrecio() {
        return precio;
    }
}
