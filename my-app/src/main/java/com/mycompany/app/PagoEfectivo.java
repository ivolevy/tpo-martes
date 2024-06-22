package com.mycompany.app;

public class PagoEfectivo extends FormaPago {

    public PagoEfectivo(Extras extras) {
        super(extras);
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo.");
        // Aquí podrías añadir la lógica real de pago en efectivo
    }
}
