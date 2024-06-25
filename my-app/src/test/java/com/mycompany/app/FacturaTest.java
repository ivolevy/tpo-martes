package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Date;
import org.junit.Test;

public class FacturaTest {

    @Test
    public void testConstructor() {
        int numero = 1;
        Date fechaEmision = new Date();
        double monto = 100.0;

        Factura factura = new Factura(numero, fechaEmision, monto);

        assertNotNull(factura);
        assertEquals(numero, factura.getNumero());
        assertEquals(fechaEmision, factura.getFechaEmision());
        assertEquals(monto, factura.getMonto(), 0.0);
        System.out.println("Factura creada correctamente:");
        System.out.println("Número: " + numero);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Monto: " + monto);
    }

    @Test
    public void testGettersAndSetters() {
        Factura factura = new Factura(1, new Date(), 100.0);
        int nuevoNumero = 2;
        Date nuevaFecha = new Date();
        double nuevoMonto = 200.0;

        factura.setNumero(nuevoNumero);
        factura.setFechaEmision(nuevaFecha);
        factura.setMonto(nuevoMonto);

        assertEquals(nuevoNumero, factura.getNumero());
        assertEquals(nuevaFecha, factura.getFechaEmision());
        assertEquals(nuevoMonto, factura.getMonto(), 0.0);
        System.out.println("Factura actualizada correctamente:");
        System.out.println("Nuevo Número: " + nuevoNumero);
        System.out.println("Nueva Fecha de Emisión: " + nuevaFecha);
        System.out.println("Nuevo Monto: " + nuevoMonto);
    }

    @Test
    public void testEnviarFactura() {
        Factura factura = new Factura(3, new Date(), 300.0);
        factura.enviarFactura();
        System.out.println("Prueba del método enviarFactura completada.");
    }
}
