package com.mycompany.app;

import java.util.Date;

public class PoliticaPrecios {
    private int plazo;
    @SuppressWarnings("unused")
    private float porcentaje;

    public PoliticaPrecios(int plazo, float porcentaje) {
        this.plazo = plazo;
        this.porcentaje = porcentaje;
    }

    public float calcularDescuento(Date fechaReserva, Date fechaCheckIn) {
        long diferencia = fechaCheckIn.getTime() - fechaReserva.getTime();
        long dias = diferencia / (1000 * 60 * 60 * 24);

        if (dias <= plazo) {
            return 0.85f; // 15% de descuento
        } else if (dias > 60) {
            return 1.20f; // 20% de aumento
        }
        return 1.0f; // Sin cambio
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Getters y Setters
}
