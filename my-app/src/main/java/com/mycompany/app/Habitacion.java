package com.mycompany.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Habitacion implements HabitacionComponent {
    private int numeroHabitacion;
    private int capacidad;
    private String tipo;
    private List<String> extras;
    private float precio;
    private boolean disponible;

    public Habitacion(int numeroHabitacion, int capacidad, String tipo, List<String> extras, float precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.extras = new ArrayList<>(extras);
        this.precio = precio;
        this.disponible = true;
    }

    @Override
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    @Override
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public List<String> getExtras() {
        return new ArrayList<>(extras);
    }

    @Override
    public float obtenerPrecio() {
        return precio;
    }

    @Override
    public void agregarHabitacion(HabitacionComponent habitacion) {
        // No aplica para habitaciones individuales
    }

    @Override
    public void removerHabitacion(HabitacionComponent habitacion) {
        // No aplica para habitaciones individuales
    }

    @Override
    public boolean verificarDisponibilidad(Date fechaCheckIn, Date fechaCheckOut) {
        // Lógica para verificar disponibilidad de la habitación
        return disponible;
    }

    @Override
    public void actualizarDisponibilidad(Date fechaCheckIn, Date fechaCheckOut, boolean disponible) {
        this.disponible = disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
