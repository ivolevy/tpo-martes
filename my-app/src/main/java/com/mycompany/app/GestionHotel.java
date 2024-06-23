package com.mycompany.app;

import java.util.List;

public class GestionHotel {
    private List<Habitacion> habitaciones;

    public GestionHotel(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(Habitacion habitacion) {
        habitaciones.remove(habitacion);
    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numero) {
                return habitacion;
            }
        }
        return null;
    }
}
