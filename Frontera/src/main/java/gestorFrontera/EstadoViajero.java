package gestorFrontera;
/**
 * Clase que representa el estado de un viajero
 * Un viajero puede tener diferentes estados, como estar dentro del país
 * o estar bloqueado.
 */
public class EstadoViajero {
        public static final String DENTRO_DEL_PAIS = "Dentro del país";
        public static final String BLOQUEADO = "Bloqueado";

        private String estado;

        public EstadoViajero() {
            this.estado = BLOQUEADO;
        }

        public String getEstado() {
            return estado;
        }

        public void cambiarEstado(String nuevoEstado) {
            this.estado = nuevoEstado;
        }
}
