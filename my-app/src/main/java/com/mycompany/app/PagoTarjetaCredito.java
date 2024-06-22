package com.mycompany.app;

public class PagoTarjetaCredito implements FormaPago {
    private String numTarjeta;
    private double monto;

    public PagoTarjetaCredito(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double monto) {
        this.monto = monto;
        // Lógica de pago con tarjeta de crédito
        System.out.println("Pago realizado con tarjeta de crédito: " + monto);
    }
}
