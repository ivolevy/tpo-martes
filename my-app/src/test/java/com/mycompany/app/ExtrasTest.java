package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExtrasTest {

    private Extras extras;

    @Before
    public void setUp() {
        extras = new Extras("Desayuno", 15.0);
        System.out.println("Extras creado para pruebas: " + extras);
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("Ejecutando testGetDescripcion...");

        String descripcionEsperada = "Desayuno";

        String descripcionObtenida = extras.getDescripcion();

        System.out.println("Descripción esperada: " + descripcionEsperada);
        System.out.println("Descripción obtenida: " + descripcionObtenida);

        assertEquals(descripcionEsperada, descripcionObtenida);
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("Ejecutando testSetDescripcion...");

        String nuevaDescripcion = "Spa";
        extras.setDescripcion(nuevaDescripcion);

        String descripcionObtenida = extras.getDescripcion();

        System.out.println("Nueva descripción esperada: " + nuevaDescripcion);
        System.out.println("Descripción obtenida: " + descripcionObtenida);

        assertEquals(nuevaDescripcion, descripcionObtenida);
    }

    @Test
    public void testGetPrecio() {
        System.out.println("Ejecutando testGetPrecio...");

        double precioEsperado = 15.0;

        double precioObtenido = extras.getPrecio();

        System.out.println("Precio esperado: " + precioEsperado);
        System.out.println("Precio obtenido: " + precioObtenido);

        assertEquals(precioEsperado, precioObtenido, 0.001);
    }

    @Test
    public void testSetPrecio() {
        System.out.println("Ejecutando testSetPrecio...");

        double nuevoPrecio = 20.0;
        extras.setPrecio(nuevoPrecio);

        double precioObtenido = extras.getPrecio();

        System.out.println("Nuevo precio esperado: " + nuevoPrecio);
        System.out.println("Precio obtenido: " + precioObtenido);

        assertEquals(nuevoPrecio, precioObtenido, 0.001);
    }
}
