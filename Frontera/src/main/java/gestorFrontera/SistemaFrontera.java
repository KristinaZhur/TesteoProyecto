package gestorFrontera;

/**
 * Este sistema se encarga de verificar si un viajero puede acceder o no al país,
 * basado en la validación de su documento y el escaneo.
 */
public class SistemaFrontera {
    private Seguridad seguridad;
    private EstadoViajero estadoViajero;

    public SistemaFrontera() {
        this.seguridad = new Seguridad();
        estadoViajero = new EstadoViajero();
    }
    public SistemaFrontera(Seguridad seguridad) {
        this.seguridad = seguridad;
    }

    /**
     * Verifica si un viajero tiene acceso al país.
     * Si el documento del viajero esta válido y pasa el escaneo, su estado se cambia
     * a "Dentro del país". Si no pasa la validación, su estado se cambia a "Bloqueado".
     *
     * @param viajero El viajero que desea ser verificado.
     */
    public void verificar(Viajero viajero) {
        if ( seguridad.escanear(viajero)) {
            estadoViajero.cambiarEstado(EstadoViajero.DENTRO_DEL_PAIS);
            System.out.println("Acceso permitido a " + viajero.getNombre());
        } else {
            estadoViajero.cambiarEstado(EstadoViajero.BLOQUEADO);
            System.out.println("Acceso denegado a " + viajero.getNombre());
        }
    }

    public String obtenerEstado() {
        return estadoViajero.getEstado();
    }
}