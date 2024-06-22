package com.mycompany.app;

public class PagoEfectivo implements FormaPago {
    private double monto;

    @Override
    public void pagar(double monto) {
        this.monto = monto;
        // Lógica de pago en efectivo
        System.out.println("Pago realizado en efectivo: " + monto);
    }
}
