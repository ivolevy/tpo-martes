package com.mycompany.app;

public class Habitacion extends HabitacionComponent {
    public Habitacion(int numeroHabitacion, int capacidad, String tipo, double precio, String descripcion) {
        super(numeroHabitacion, capacidad, tipo, precio, descripcion);
    }

    @Override
    public void actualizarDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    protected void setPrecio(double nuevoPrecio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecio'");
    }

    @Override
    protected void agregarHabitacion(HabitacionComponent habitacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarHabitacion'");
    }

    @Override
    protected void removerHabitacion(HabitacionComponent habitacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerHabitacion'");
    }

    public double obtenerPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPrecio'");
    }
}