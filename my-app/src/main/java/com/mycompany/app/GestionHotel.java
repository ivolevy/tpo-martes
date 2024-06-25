package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class GestionHotel {
    private List<Habitacion> habitaciones;

    public GestionHotel() {
        habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion buscarHabitacionPorNumero(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null;
    }
}
