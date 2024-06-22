package com.mycompany.app;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PoliticaPrecios {
    private float plazo;
    private float porcentaje;

    public PoliticaPrecios(float plazo, float porcentaje) {
        this.plazo = plazo;
        this.porcentaje = porcentaje;
    }

    public float calcularDescuento(Date fechaReserva, Date fechaCheckin) {
        long diffInMillies = Math.abs(fechaCheckin.getTime() - fechaReserva.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        if (diff <= 15) {
            return -0.15f; // Descuento del 15% por reserva a corto plazo
        } else if (diff >= 60) {
            return 0.20f; // Aumento del 20% por reserva a largo plazo
        }
        return 0.0f;
    }

    // Getters y setters

    public float getPlazo() {
        return plazo;
    }

    public void setPlazo(float plazo) {
        this.plazo = plazo;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
}

