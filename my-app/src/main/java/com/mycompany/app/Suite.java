package com.mycompany.app;

public class Suite extends Habitacion {
    private boolean tieneJacuzzi;

    public Suite(int id, int numeroHabitacion, String tipo, double precio, String descripcion, boolean tieneJacuzzi) {
        super(id, numeroHabitacion, tipo, precio, descripcion);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    // Método adicional
    public double obtenerPrecio() {
        return super.getPrecio() + (tieneJacuzzi ? 50.0 : 0.0);
    }
}
