package com.mycompany.app;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PoliticaPrecios {

    private double descuentoPorDefecto;
    private double aumentoPorDefecto;

    public PoliticaPrecios() {
        this.descuentoPorDefecto = 0.15; 
        this.aumentoPorDefecto = 0.20; 
    }

    public double calcularPrecio(double precioBase, int diasAnticipacion) {
        System.out.println("Calculando precio para base: " + precioBase + " con diasAnticipacion: " + diasAnticipacion);
        if (diasAnticipacion <= 15) {
            System.out.println("Aplicando descuento del 15%");
            return precioBase * (1 - descuentoPorDefecto);
        } else if (diasAnticipacion > 60) {
            System.out.println("Aplicando aumento del 20%");
            return precioBase * (1 + aumentoPorDefecto);
        } else {
            System.out.println("Sin cambios en el precio");
            return precioBase;
        }
    }
    

    public double calcularDescuento(Date fechaReserva, Date fechaCheckIn) {
        long diffInMillies = Math.abs(fechaCheckIn.getTime() - fechaReserva.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        if (diff <= 15) {
            return descuentoPorDefecto;
        } else if (diff > 60) {
            return aumentoPorDefecto;
        } else {
            return 0;
        }
    }

    public void setDescuentoPorDefecto(double descuentoPorDefecto) {
        this.descuentoPorDefecto = descuentoPorDefecto;
    }

    public void setAumentoPorDefecto(double aumentoPorDefecto) {
        this.aumentoPorDefecto = aumentoPorDefecto;
    }
}
