package com.mycompany.app;

import java.util.List;

public class PagoTransferencia extends FormaPago {
    @SuppressWarnings("unused")
    private String numTarjeta;
    @SuppressWarnings("unused")
    private float monto;

    public PagoTransferencia(List<String> extras, String numTarjeta, float monto) {
        super(extras);
        this.numTarjeta = numTarjeta;
        this.monto = monto;
    }

    @Override
    public void pagar(float monto) {
        System.out.println("Pagando con transferencia: " + monto);
    }
}