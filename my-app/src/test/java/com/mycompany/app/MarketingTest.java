package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MarketingTest {

    private Marketing marketing;

    @Before
    public void setUp() {
        marketing = new Marketing("Promoción Verano", 10.0);
        System.out.println("Marketing creado para pruebas: " + marketing);
    }

    @Test
    public void testGetCampaña() {
        System.out.println("Ejecutando testGetCampaña...");

        String campañaEsperada = "Promoción Verano";

        String campañaObtenida = marketing.getCampaña();

        System.out.println("Campaña esperada: " + campañaEsperada);
        System.out.println("Campaña obtenida: " + campañaObtenida);

        assertEquals(campañaEsperada, campañaObtenida);
    }
@Test
    public void testSetCampaña() {
        System.out.println("Ejecutando testSetCampaña...");

        String nuevaCampaña = "Promoción Invierno";
        marketing.setCampaña(nuevaCampaña);

        String campañaObtenida = marketing.getCampaña();

        System.out.println("Nueva campaña esperada: " + nuevaCampaña);
        System.out.println("Campaña obtenida: " + campañaObtenida);

        assertEquals(nuevaCampaña, campañaObtenida);
    }

    @Test
    public void testGetDescuento() {
        System.out.println("Ejecutando testGetDescuento...");

        double descuentoEsperado = 10.0;

        double descuentoObtenido = marketing.getDescuento();

        System.out.println("Descuento esperado: " + descuentoEsperado);
        System.out.println("Descuento obtenido: " + descuentoObtenido);

        assertEquals(descuentoEsperado, descuentoObtenido, 0.001);
    }

    @Test
    public void testSetDescuento() {
        System.out.println("Ejecutando testSetDescuento...");

        double nuevoDescuento = 20.0;
        marketing.setDescuento(nuevoDescuento);

        double descuentoObtenido = marketing.getDescuento();

        System.out.println("Nuevo descuento esperado: " + nuevoDescuento);
        System.out.println("Descuento obtenido: " + descuentoObtenido);

        assertEquals(nuevoDescuento, descuentoObtenido, 0.001);
    }
@Test
    public void testAplicarDescuento() {
        System.out.println("Ejecutando testAplicarDescuento...");

        double precioOriginal = 100.0;
        double precioEsperadoConDescuento = 90.0;

        double precioObtenidoConDescuento = marketing.aplicarDescuento(precioOriginal);

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio esperado con descuento: " + precioEsperadoConDescuento);
        System.out.println("Precio obtenido con descuento: " + precioObtenidoConDescuento);

        assertEquals(precioEsperadoConDescuento, precioObtenidoConDescuento, 0.001);
    }
}