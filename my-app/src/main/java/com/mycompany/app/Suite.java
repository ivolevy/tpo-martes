package com.mycompany.app;

public class Suite extends Habitacion {
    private String serviciosAdicionales;

    public Suite(int numeroHabitacion, double precio, String serviciosAdicionales) {
        super(numeroHabitacion, precio);
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public String getServiciosAdicionales() {
        return serviciosAdicionales;
    }
}
