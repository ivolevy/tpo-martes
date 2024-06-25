package com.mycompany.app;

public class Factura {
    private Cliente cliente;
    private Reserva reserva;
    private double monto;

    public Factura(Cliente cliente, Reserva reserva, double monto) {
        this.cliente = cliente;
        this.reserva = reserva;
        this.monto = monto;
    }

    public void enviarFactura() {
        System.out.println("Enviando factura a " + cliente.getEmail());
        // Aquí podrías agregar la lógica para enviar la factura por email.
    }
}
