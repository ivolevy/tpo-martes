package com.mycompany.app;

public class PagoEfectivo implements FormaPago {
    @SuppressWarnings("unused")
    private double monto;

    @Override
    public void pagar(double monto) {
        this.monto = monto;
        System.out.println("Pago realizado en efectivo: " + monto);
    }
}
