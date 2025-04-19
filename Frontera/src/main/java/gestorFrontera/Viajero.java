package gestorFrontera;

/**
 * @author Kristina Zhuravleva
 * @since 30.03.2025
 * Clase que representa  un viajero con nombre y documento de identificación.
 * El viajero puede ser verificado en un sistema de control de frontera para determinar su acceso al país.
 */

public class Viajero {
    private String nombre;
    private String documento;

    public Viajero(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el documento del viajero.
     *
     * @return El documento del viajero.
     */
    public String getDocumento() {
        return documento;
    }
}