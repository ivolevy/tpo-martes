package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GestionNotificacionesTest {
    private GestionNotificaciones gestionNotificaciones;

    @Before
    public void setUp() {
        List<NotificacionStrategy> estrategias = new ArrayList<>();
        estrategias.add(new EmailNotificacionStrategy());
        estrategias.add(new SMSNotificacionStrategy());

        gestionNotificaciones = new GestionNotificaciones(estrategias);
    }

    @Test
    public void testEnviarNotificacion() {
        String mensaje = "Esta es una notificación de prueba.";
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = gestionNotificaciones.enviarNotificacion(mensaje);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testConfiguracionNotificaciones() {
        String tipoNotificacion = "Email";
        gestionNotificaciones.configurarTipoNotificacion(tipoNotificacion);

        String resultadoEsperado = "Email";
        String resultadoObtenido = gestionNotificaciones.getTipoNotificacion();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
