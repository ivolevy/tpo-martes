package com.mycompany.app;

public class PagoTransferencia implements FormaPago {
    private String numTarjeta;

    public PagoTransferencia(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double monto) {
        // Lógica de pago con transferencia
        System.out.println("Pago realizado por transferencia: " + monto);
    }
}

