package com.mycompany.app;

public class PagoTransferencia implements FormaPago {
    @SuppressWarnings("unused")
    private String numTarjeta;

    public PagoTransferencia(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago realizado por transferencia: " + monto);
    }
}

