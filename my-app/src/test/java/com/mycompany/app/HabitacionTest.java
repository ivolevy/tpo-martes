package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HabitacionTest {

    private Habitacion habitacion;

    @Before
    public void setUp() {
        habitacion = new Habitacion(1, 101, "Single", 100.0, "Habitación simple");
        System.out.println("Setup completado: " + habitacion);
    }

    @Test
    public void testGetNumeroHabitacion() {
        int numeroHabitacion = habitacion.getNumeroHabitacion();
        System.out.println("Test getNumeroHabitacion: " + numeroHabitacion);
        assertEquals(101, numeroHabitacion);
    }

    @Test
    public void testSetNumeroHabitacion() {
        habitacion.setNumeroHabitacion(102);
        int numeroHabitacion = habitacion.getNumeroHabitacion();
        System.out.println("Test setNumeroHabitacion: " + numeroHabitacion);
        assertEquals(102, numeroHabitacion);
    }

    @Test
    public void testGetTipo() {
        String tipo = habitacion.getTipo();
        System.out.println("Test getTipo: " + tipo);
        assertEquals("Single", tipo);
    }

    @Test
    public void testSetTipo() {
        habitacion.setTipo("Double");
        String tipo = habitacion.getTipo();
        System.out.println("Test setTipo: " + tipo);
        assertEquals("Double", tipo);
    }

    @Test
    public void testGetPrecio() {
        double precio = habitacion.getPrecio();
        System.out.println("Test getPrecio: " + precio);
        assertEquals(100.0, precio, 0.001);
    }

    @Test
    public void testSetPrecio() {
        habitacion.setPrecio(120.0);
        double precio = habitacion.getPrecio();
        System.out.println("Test setPrecio: " + precio);
        assertEquals(120.0, precio, 0.001);
    }

    @Test
    public void testGetDescripcion() {
        String descripcion = habitacion.getDescripcion();
        System.out.println("Test getDescripcion: " + descripcion);
        assertEquals("Habitación simple", descripcion);
    }

    @Test
    public void testSetDescripcion() {
        habitacion.setDescripcion("Habitación doble");
        String descripcion = habitacion.getDescripcion();
        System.out.println("Test setDescripcion: " + descripcion);
        assertEquals("Habitación doble", descripcion);
    }
}
