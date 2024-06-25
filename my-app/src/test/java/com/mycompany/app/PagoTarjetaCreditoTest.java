package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PagoTarjetaCreditoTest {

    @Test
    public void testPagar() {
        String numTarjeta = "1234567890123456";
        PagoTarjetaCredito pagoTarjetaCredito = new PagoTarjetaCredito(numTarjeta);
        double monto = 200.0;
        
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pagoTarjetaCredito.pagar(monto);
        
        assertEquals("Pago realizado con tarjeta de crédito: 200.0\n", outContent.toString());
    }
}
