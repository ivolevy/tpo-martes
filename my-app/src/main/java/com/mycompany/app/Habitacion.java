package com.mycompany.app;

import java.util.List;

public class Habitacion implements HabitacionComponent {
    private int numeroHabitacion;
    private int capacidad;
    private String tipoHabitacion;
    private List<Extras> extras;
    @SuppressWarnings("unused")
    private boolean disponible;

    public Habitacion(int numeroHabitacion, int capacidad, String tipoHabitacion, List<Extras> extras) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipoHabitacion = tipoHabitacion;
        this.extras = extras;
        this.disponible = true;
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
        return "Habitación " + numeroHabitacion + " de tipo " + tipoHabitacion;
    }

    public void agregarHabitacion(HabitacionComponent habitacionComponent) {
        // No aplica para hoja
    }

    public void removerHabitacion(HabitacionComponent habitacionComponent) {
        // No aplica para hoja
    }

    public void actualizarDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public void quitarHabitacion(HabitacionComponent habitacionComponent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quitarHabitacion'");
    }
}
