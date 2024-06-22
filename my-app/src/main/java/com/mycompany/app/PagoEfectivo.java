package com.hotelmanagement;

public class PagoEfectivo extends FormaPago {
    public PagoEfectivo(Extras extras) {
        super(extras);
        //TODO Auto-generated constructor stub
    }

    private float monto;

    @Override
    public void pagar(double monto) {
        // Lógica para realizar pago por transferencia
    }
}