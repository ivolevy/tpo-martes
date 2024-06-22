package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Suite extends Habitacion {
    private List<HabitacionComponent> children = new ArrayList<>();

    public Suite(int numeroHabitacion, int capacidad, double precio, String descripcion) {
        super(numeroHabitacion, capacidad, "Suite", precio, descripcion);
    }

    @Override
    public void agregarHabitacion(HabitacionComponent habitacionComponent) {
        children.add(habitacionComponent);
    }

    @Override
    public void removerHabitacion(HabitacionComponent habitacionComponent) {
        children.remove(habitacionComponent);
    }

    @Override
    public List<HabitacionComponent> getHabitaciones() {
        return children;
    }

    @Override
    public double obtenerPrecio() {
        double total = super.obtenerPrecio();
        for (HabitacionComponent hc : children) {
            total += hc.obtenerPrecio();
        }
        return total;
    }

    @Override
    public String obtenerDescripcion() {
        StringBuilder desc = new StringBuilder(super.obtenerDescripcion());
        for (HabitacionComponent hc : children) {
            desc.append("\n").append(hc.obtenerDescripcion());
        }
        return desc.toString();
    }
}
