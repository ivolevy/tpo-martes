package com.mycompany.app;

import java.util.List;

public class PagoTarjetaDebito extends FormaPago {
    @SuppressWarnings("unused")
    private String numTarjeta;
    @SuppressWarnings("unused")
    private float monto;

    public PagoTarjetaDebito(List<String> extras, String numTarjeta, float monto) {
        super(extras);
        this.numTarjeta = numTarjeta;
        this.monto = monto;
    }

    @Override
    public void pagar(float monto) {
        System.out.println("Pagando con tarjeta de débito: " + monto);
    }
}