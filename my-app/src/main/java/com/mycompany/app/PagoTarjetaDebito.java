package com.mycompany.app;

public class PagoTarjetaDebito implements FormaPago {
    @SuppressWarnings("unused")
    private String numTarjeta;
    @SuppressWarnings("unused")
    private double monto;

    public PagoTarjetaDebito(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double monto) {
        this.monto = monto;
        System.out.println("Pago realizado con tarjeta de débito: " + monto);
    }
}
