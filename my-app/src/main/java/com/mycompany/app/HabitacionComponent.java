package com.mycompany.app;

public abstract class HabitacionComponent {
    protected int numeroHabitacion;
    protected int capacidad;
    protected String tipo;
    protected double precio;
    protected String descripcion;
    protected boolean disponible;

    public HabitacionComponent(int numeroHabitacion, int capacidad, String tipo, double precio, String descripcion) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.disponible = true;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract void actualizarDisponibilidad(boolean disponible);

    protected abstract void setPrecio(double nuevoPrecio);

    protected abstract void agregarHabitacion(HabitacionComponent habitacion);

    protected abstract void removerHabitacion(HabitacionComponent habitacion);

    protected abstract double obtenerPrecio();
}