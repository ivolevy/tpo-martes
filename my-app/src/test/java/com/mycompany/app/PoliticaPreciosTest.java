package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PoliticaPreciosTest {

    private PoliticaPrecios politicaPrecios;

    @Before
    public void setUp() {
        politicaPrecios = new PoliticaPrecios();
    }

    @Test
public void testCalcularPrecioDescuento() {
    double precioBase = 1000.0;
    double precioEsperado = 850.0; // 15% de descuento
    double precioCalculado = politicaPrecios.calcularPrecio(precioBase, 10);
    System.out.println("Precio calculado: " + precioCalculado + " Precio esperado: " + precioEsperado);
    assertEquals(precioEsperado, precioCalculado, 0.01);
}

@Test
public void testCalcularPrecioAumento() {
    double precioBase = 1000.0;
    double precioEsperado = 1200.0; 
    double precioCalculado = politicaPrecios.calcularPrecio(precioBase, 70);
    System.out.println("Precio calculado: " + precioCalculado + " Precio esperado: " + precioEsperado);
    assertEquals(precioEsperado, precioCalculado, 0.01);
}

@Test
public void testCalcularPrecioSinCambio() {
    double precioBase = 1000.0;
    double precioEsperado = 1000.0; 
    double precioCalculado = politicaPrecios.calcularPrecio(precioBase, 30);
    System.out.println("Precio calculado: " + precioCalculado + " Precio esperado: " + precioEsperado);
    assertEquals(precioEsperado, precioCalculado, 0.01);
}

}
