package com.mycompany.app;

public class PagoTarjetaCredito implements FormaPago {
    @SuppressWarnings("unused")
    private String numTarjeta;
    @SuppressWarnings("unused")
    private double monto;

    public PagoTarjetaCredito(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double monto) {
        this.monto = monto;
        System.out.println("Pago realizado con tarjeta de crédito: " + monto);
    }
}
