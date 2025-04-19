package org.example;
import gestorFrontera.Seguridad;
import gestorFrontera.SistemaFrontera;
import gestorFrontera.Viajero;

public class Main {
    /**
     * Clase principal que simula el proceso de verificación de viajeros en un sistema de control frontera.
     * Los viajeros son verificados basándose en su documento y escaneo para determinar su estado de acceso.
     */

    public static void main(String[] args) {


        Viajero viajero1 = new Viajero("Juan", "pasaporte123"); // Documento válido
        Viajero viajero2 = new Viajero("Ana", ""); // Documento vacío
        Viajero viajero3 = new Viajero("Carl", "pasaporte456");
        SistemaFrontera sistemaFrontera1 = new SistemaFrontera();
        SistemaFrontera sistemaFrontera2 = new SistemaFrontera();
        SistemaFrontera sistemaFrontera3 = new SistemaFrontera();
        sistemaFrontera1.verificar(viajero1);
        sistemaFrontera2.verificar(viajero2);
        sistemaFrontera3.verificar(viajero3);

        System.out.println(viajero1.getNombre() + " - Estado: " + sistemaFrontera1.obtenerEstado());
        System.out.println(viajero2.getNombre() + " - Estado: " + sistemaFrontera2.obtenerEstado());
        System.out.println(viajero3.getNombre() + " - Estado: " + sistemaFrontera3.obtenerEstado());
    }
}