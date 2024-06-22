package com.mycompany.app;

import java.util.Date;

public class Factura {
    private int numero;
    private Date fechaEmision;
    private double monto;

    public Factura(int numero, Date fechaEmision, double monto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void enviarFactura() {
        // Lógica para enviar la factura
    }
}
