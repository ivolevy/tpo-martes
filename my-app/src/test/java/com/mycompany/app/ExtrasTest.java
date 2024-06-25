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

        // Datos de prueba
        String descripcionEsperada = "Desayuno";

        // Ejecución de la prueba
        String descripcionObtenida = extras.getDescripcion();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Descripción esperada: " + descripcionEsperada);
        System.out.println("Descripción obtenida: " + descripcionObtenida);

        // Aserción
        assertEquals(descripcionEsperada, descripcionObtenida);
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("Ejecutando testSetDescripcion...");

        // Datos de prueba
        String nuevaDescripcion = "Spa";
        extras.setDescripcion(nuevaDescripcion);

        // Ejecución de la prueba
        String descripcionObtenida = extras.getDescripcion();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nueva descripción esperada: " + nuevaDescripcion);
        System.out.println("Descripción obtenida: " + descripcionObtenida);

        // Aserción
        assertEquals(nuevaDescripcion, descripcionObtenida);
    }

    @Test
    public void testGetPrecio() {
        System.out.println("Ejecutando testGetPrecio...");

        // Datos de prueba
        double precioEsperado = 15.0;

        // Ejecución de la prueba
        double precioObtenido = extras.getPrecio();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Precio esperado: " + precioEsperado);
        System.out.println("Precio obtenido: " + precioObtenido);

        // Aserción
        assertEquals(precioEsperado, precioObtenido, 0.001);
    }

    @Test
    public void testSetPrecio() {
        System.out.println("Ejecutando testSetPrecio...");

        // Datos de prueba
        double nuevoPrecio = 20.0;
        extras.setPrecio(nuevoPrecio);

        // Ejecución de la prueba
        double precioObtenido = extras.getPrecio();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nuevo precio esperado: " + nuevoPrecio);
        System.out.println("Precio obtenido: " + precioObtenido);

        // Aserción
        assertEquals(nuevoPrecio, precioObtenido, 0.001);
    }
}
