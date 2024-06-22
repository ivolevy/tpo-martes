package com.mycompany.app;

import java.util.Date;

public class Factura {
    private int numero;
    @SuppressWarnings("unused")
    private Date fechaEmision;
    @SuppressWarnings("unused")
    private float monto;

    public Factura(int numero, Date fechaEmision, float monto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.monto = monto;
    }

    public void enviarFactura() {
        System.out.println("Factura enviada: " + this.numero);
    }

    // Getters y Setters
}
