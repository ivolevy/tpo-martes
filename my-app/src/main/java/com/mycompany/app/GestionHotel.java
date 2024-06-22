package com.hotelmanagement;

import java.util.List;

public class GestionHotel {
    private Contabilidad contabilidad;
    private Marketing marketing;
    private GestionNotificaciones gestionNotificaciones;

    public void cargarCliente(Cliente cliente) {
        // Lógica para cargar cliente
    }

    public void cargarHabitacion(Habitacion habitacion) {
        // Lógica para cargar habitación
    }

    public void buscarHabitaciones(int cantidadPersonas, String tipo, List<String> extras) {
        // Lógica para buscar habitaciones
    }

    public void reservarHabitacion(Reserva reserva) {
        // Lógica para reservar habitación
    }

    public void cancelarHabitacion(Reserva reserva) {
        // Lógica para cancelar habitación
    }

    public void actualizarParametrosFactura(int plazo, float porcentaje) {
        // Lógica para actualizar parámetros de facturación
    }

    public void enviarFactura(Reserva reserva) {
        // Lógica para enviar factura
    }

    public void generarReporteEstadoHabitaciones() {
        // Lógica para generar reporte de estado de habitaciones
    }
}
