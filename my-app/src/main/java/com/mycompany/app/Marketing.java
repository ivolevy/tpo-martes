package com.mycompany.app;

public class Marketing {
    private String campaña;
    private double descuento;

    public Marketing(String campaña, double descuento) {
        this.campaña = campaña;
        this.descuento = descuento;
    }

    public String getCampaña() {
        return campaña;
    }

    public void setCampaña(String campaña) {
        this.campaña = campaña;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * descuento / 100);
    }
}
