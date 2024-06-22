package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Habitacion implements HabitacionComponent {
    private int numeroHabitacion;
    private int capacidad;
    private String tipoHabitacion;
    private double precio;
    private String descripcion;
    @SuppressWarnings("unused")
    private boolean disponibilidad;
    private List<HabitacionComponent> extras = new ArrayList<>();

    public Habitacion(int numeroHabitacion, int capacidad, String tipoHabitacion, double precio, String descripcion) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.disponibilidad = true;
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
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return descripcion;
    }

    @Override
    public void actualizarDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void agregarHabitacion(HabitacionComponent habitacionComponent) {
        extras.add(habitacionComponent);
    }

    @Override
    public void removerHabitacion(HabitacionComponent habitacionComponent) {
        extras.remove(habitacionComponent);
    }

    @Override
    public List<HabitacionComponent> getHabitaciones() {
        return extras;
    }
}
