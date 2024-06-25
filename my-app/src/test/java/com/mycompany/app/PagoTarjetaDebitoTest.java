package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PagoTarjetaDebitoTest {

    @Test
    public void testPagar() {
        String numTarjeta = "9876543210987654";
        PagoTarjetaDebito pagoTarjetaDebito = new PagoTarjetaDebito(numTarjeta);
        double monto = 150.0;
        
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pagoTarjetaDebito.pagar(monto);
        
        assertEquals("Pago realizado con tarjeta de débito: 150.0\n", outContent.toString());
    }
}
