package com.mycompany.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionHotel gestionHotel = new GestionHotel();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Gestión de Hotel ===");
            System.out.println("1. Agregar habitación");
            System.out.println("2. Eliminar habitación");
            System.out.println("3. Buscar habitación");
            System.out.println("4. Cargar cliente");
            System.out.println("5. Realizar reserva");
            System.out.println("6. Cancelar reserva");
            System.out.println("7. Enviar factura");
            System.out.println("8. Generar estado de habitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de habitación: ");
                    int numeroAgregar = scanner.nextInt();
                    System.out.print("Ingrese el precio de la habitación: ");
                    double precioAgregar = scanner.nextDouble();
                    System.out.print("¿Es una suite? (si/no): ");
                    String esSuite = scanner.next();
                    if (esSuite.equalsIgnoreCase("si")) {
                        scanner.nextLine();  // Consume newline
                        System.out.print("Ingrese los servicios adicionales: ");
                        String serviciosAdicionales = scanner.nextLine();
                        Suite suiteAgregar = new Suite(numeroAgregar, precioAgregar, serviciosAdicionales);
                        gestionHotel.agregarHabitacion(suiteAgregar);
                    } else {
                        Habitacion habitacionAgregar = new Habitacion(numeroAgregar, precioAgregar);
                        gestionHotel.agregarHabitacion(habitacionAgregar);
                    }
                    System.out.println("Habitación agregada.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de habitación a eliminar: ");
                    int numeroEliminar = scanner.nextInt();
                    Habitacion habitacionEliminar = gestionHotel.buscarHabitacion(numeroEliminar);
                    if (habitacionEliminar != null) {
                        gestionHotel.eliminarHabitacion(habitacionEliminar);
                        System.out.println("Habitación eliminada.");
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de habitación a buscar: ");
                    int numeroBuscar = scanner.nextInt();
                    Habitacion habitacionBuscar = gestionHotel.buscarHabitacion(numeroBuscar);
                    if (habitacionBuscar != null) {
                        System.out.println("Habitación encontrada: " + habitacionBuscar.getNumeroHabitacion() + ", Precio: " + habitacionBuscar.getPrecio());
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;
                case 4:
                    scanner.nextLine();  // Consume newline
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el email del cliente: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefono = scanner.nextLine();
                    Cliente cliente = new Cliente(nombre, apellido, email, telefono);
                    gestionHotel.agregarCliente(cliente);
                    System.out.println("Cliente agregado.");
                    break;
                case 5:
                    System.out.print("Ingrese el email del cliente: ");
                    scanner.nextLine();  // Consume newline
                    String emailReserva = scanner.nextLine();
                    Cliente clienteReserva = gestionHotel.buscarCliente(emailReserva);
                    if (clienteReserva != null) {
                        System.out.print("Ingrese el número de habitación: ");
                        int numeroReserva = scanner.nextInt();
                        Habitacion habitacionReserva = gestionHotel.buscarHabitacion(numeroReserva);
                        if (habitacionReserva != null) {
                            System.out.print("Ingrese la fecha de inicio (dd/mm/yyyy): ");
                            String fechaInicio = scanner.next();
                            System.out.print("Ingrese la fecha de fin (dd/mm/yyyy): ");
                            String fechaFin = scanner.next();
                            double monto = habitacionReserva.getPrecio();
                            System.out.println("Monto a pagar: " + monto);
                            System.out.print("Ingrese el método de pago (efectivo/tarjeta): ");
                            scanner.nextLine();  // Consume newline
                            String metodoPago = scanner.nextLine();
                            if (metodoPago.equalsIgnoreCase("tarjeta")) {
                                System.out.print("Ingrese el número de tarjeta: ");
                                String numeroTarjeta = scanner.nextLine();
                                // Lógica de procesamiento de pago con tarjeta
                                System.out.println("Procesando pago con tarjeta...");
                                // Asumimos que el pago se procesa correctamente.
                                System.out.println("Pago realizado con éxito.");
                            } else {
                                System.out.println("Pago en efectivo recibido.");
                            }
                            Reserva reserva = new Reserva(habitacionReserva, clienteReserva, fechaInicio, fechaFin);
                            gestionHotel.realizarReserva(reserva);
                            Factura factura = new Factura(clienteReserva, reserva, monto);
                            factura.enviarFactura();
                            System.out.println("Reserva realizada y factura enviada.");
                        } else {
                            System.out.println("Habitación no encontrada.");
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el email del cliente: ");
                    scanner.nextLine();  // Consume newline
                    String emailCancelar = scanner.nextLine();
                    Cliente clienteCancelar = gestionHotel.buscarCliente(emailCancelar);
                    if (clienteCancelar != null) {
                        System.out.print("Ingrese el número de habitación: ");
                        int numeroCancelar = scanner.nextInt();
                        Habitacion habitacionCancelar = gestionHotel.buscarHabitacion(numeroCancelar);
                        if (habitacionCancelar != null) {
                            Reserva reservaCancelar = null;
                            for (Reserva reserva : gestionHotel.obtenerReservas()) {
                                if (reserva.getHabitacion().equals(habitacionCancelar) && reserva.getCliente().equals(clienteCancelar)) {
                                    reservaCancelar = reserva;
                                    break;
                                }
                            }
                            if (reservaCancelar != null) {
                                gestionHotel.cancelarReserva(reservaCancelar);
                                System.out.println("Reserva cancelada.");
                            } else {
                                System.out.println("Reserva no encontrada.");
                            }
                        } else {
                            System.out.println("Habitación no encontrada.");
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el email del cliente: ");
                    scanner.nextLine();  // Consume newline
                    String emailFactura = scanner.nextLine();
                    Cliente clienteFactura = gestionHotel.buscarCliente(emailFactura);
                    if (clienteFactura != null) {
                        System.out.print("Ingrese el número de habitación: ");
                        int numeroFactura = scanner.nextInt();
                        Habitacion habitacionFactura = gestionHotel.buscarHabitacion(numeroFactura);
                        if (habitacionFactura != null) {
                            Reserva reservaFactura = null;
                            for (Reserva reserva : gestionHotel.obtenerReservas()) {
                                if (reserva.getHabitacion().equals(habitacionFactura) && reserva.getCliente().equals(clienteFactura)) {
                                    reservaFactura = reserva;
                                    break;
                                }
                            }
                            if (reservaFactura != null) {
                                double monto = habitacionFactura.getPrecio();
                                Factura factura = new Factura(clienteFactura, reservaFactura, monto);
                                factura.enviarFactura();
                                System.out.println("Factura enviada.");
                            } else {
                                System.out.println("Reserva no encontrada.");
                            }
                        } else {
                            System.out.println("Habitación no encontrada.");
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 8:
                    gestionHotel.generarEstadoHabitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }
}
