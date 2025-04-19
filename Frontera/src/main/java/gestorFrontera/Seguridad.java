package gestorFrontera;
/**
 * Clase que representa el sistema de seguridad en el control de la frontera.
 * Esta clase proporciona métodos para escanear y validar a los viajeros
 * mediante su documento de identificación.
 */
public class Seguridad {

    public boolean escanear(Viajero viajero) {

        return validar(viajero);  // true si el escaneo es exitoso.
    }
    public boolean validar(Viajero viajero) {

        return viajero.getDocumento() != null && !viajero.getDocumento().isEmpty();
    }
}