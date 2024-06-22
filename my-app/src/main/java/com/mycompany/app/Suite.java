package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Suite implements HabitacionComponent {
    private int numeroHabitacion;
    private int capacidad;
    private String tipoHabitacion;
    private List<HabitacionComponent> habitaciones = new ArrayList<>();
    private List<Extras> extras;

    public Suite(int numeroHabitacion, int capacidad, String tipoHabitacion, List<Extras> extras) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipoHabitacion = tipoHabitacion;
        this.extras = extras;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public List<Extras> getExtras() {
        return extras;
    }

    public double obtenerPrecio() {
        // Lógica para obtener precio
        return 0;
    }

    public String obtenerDescripcion() {
        // Lógica para obtener descripción
        return "Suite " + numeroHabitacion + " de tipo " + tipoHabitacion;
    }

    public void agregarHabitacion(HabitacionComponent habitacionComponent) {
        habitaciones.add(habitacionComponent);
    }

    public void removerHabitacion(HabitacionComponent habitacionComponent) {
        habitaciones.remove(habitacionComponent);
    }

    public void actualizarDisponibilidad(boolean disponible) {
        // Lógica para actualizar disponibilidad
    }

    @Override
    public void quitarHabitacion(HabitacionComponent habitacionComponent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quitarHabitacion'");
    }
}
