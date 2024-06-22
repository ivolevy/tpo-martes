package com.hotelmanagement;

public class PagoTransferencia extends FormaPago {
    private String numTarjeta;
    private float monto;

    public PagoTransferencia(Extras extras, String numTarjeta, float monto) {
        super(extras);
        this.numTarjeta = numTarjeta;
        this.monto = monto;
    }

    @Override
    public void pagar(double monto) {
        // Lógica para realizar pago por transferencia
    }
}
