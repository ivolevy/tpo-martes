package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContabilidadTest {

    private Contabilidad contabilidad;

    @Before
    public void setUp() {
        contabilidad = new Contabilidad();
        System.out.println("Contabilidad creada para pruebas: " + contabilidad);
    }

    @Test
    public void testCalcularIngresos() {
        System.out.println("Ejecutando testCalcularIngresos...");

        double ingresosEsperados = 1000.0;
        contabilidad.registrarIngreso(500.0);
        contabilidad.registrarIngreso(500.0);

        double ingresosObtenidos = contabilidad.calcularIngresos();

        System.out.println("Ingresos esperados: " + ingresosEsperados);
        System.out.println("Ingresos obtenidos: " + ingresosObtenidos);

        assertEquals(ingresosEsperados, ingresosObtenidos, 0.001);
    }

    @Test
    public void testCalcularGastos() {
        System.out.println("Ejecutando testCalcularGastos...");

        double gastosEsperados = 200.0;
        contabilidad.registrarGasto(100.0);
        contabilidad.registrarGasto(100.0);

        double gastosObtenidos = contabilidad.calcularGastos();

        System.out.println("Gastos esperados: " + gastosEsperados);
        System.out.println("Gastos obtenidos: " + gastosObtenidos);

        assertEquals(gastosEsperados, gastosObtenidos, 0.001);
    }
}