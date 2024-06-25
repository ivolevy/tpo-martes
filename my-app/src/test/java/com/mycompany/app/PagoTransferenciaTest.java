package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PagoTransferenciaTest {

    @Test
    public void testPagar() {
        String numTarjeta = "5555555555555555";
        PagoTransferencia pagoTransferencia = new PagoTransferencia(numTarjeta);
        double monto = 300.0;
        
        // Usar un stream para capturar la salida estándar
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pagoTransferencia.pagar(monto);
        
        // Verificar que la salida sea la esperada
        assertEquals("Pago realizado por transferencia: 300.0\n", outContent.toString());
    }
}
