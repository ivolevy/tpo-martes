package com.mycompany.app;

import java.util.List;

public class PagoEfectivo extends FormaPago {
    @SuppressWarnings("unused")
    private float monto;

    public PagoEfectivo(List<String> extras, float monto) {
        super(extras);
        this.monto = monto;
    }

    @Override
    public void pagar(float monto) {
        System.out.println("Pagando en efectivo: " + monto);
    }
}