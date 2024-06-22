package com.hotelmanagement;

public class PagoTarjetaCredito extends FormaPago {
    private String numTarjeta;
    private float monto;

    public PagoTarjetaCredito(Extras extras, String numTarjeta, float monto) {
        super(extras);
        this.numTarjeta = numTarjeta;
        this.monto = monto;
    }

    @Override
    public void pagar(double monto) {
        // Lógica para realizar pago por transferencia
    }
}
