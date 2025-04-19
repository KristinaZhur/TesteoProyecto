import gestorFrontera.Seguridad;
import gestorFrontera.SistemaFrontera;
import gestorFrontera.Viajero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class SistemaFronteraTest {
    /**
     * Test verifica el accesso a traves del documento del viajero
     */
    @Test
    public void testNombre(){
        Viajero viajero = new Viajero("Vadim", "123444444");
        assertEquals("Vadim",viajero.getNombre());
    }
    @Test
    public void testAccesoPermitido() {
        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Juan", "pasaporte123");
        Seguridad mockSeg = mock(Seguridad.class);
        Viajero viajer = new Viajero("Vadim2", "99123444444");

        when(mockSeg.escanear(viajer)).thenReturn(true);

        SistemaFrontera sistema = new SistemaFrontera(mockSeg);
        sistema.verificar(viajer);

        assertEquals("Dentro del pais", sistema.obtenerEstado());

        sistemaFrontera.verificar(viajero);
        assertEquals("Dentro del país", sistemaFrontera.obtenerEstado(),
                "El estado del viajero debería ser 'Dentro del país'");
    }

    @Test
    public void testAccesoDenegadoPorDocumento() {

        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Ana", "");

        // Проверяем, что доступ был отклонен
        sistemaFrontera.verificar(viajero);
        assertEquals("Bloqueado", sistemaFrontera.obtenerEstado(),
                "El estado del viajero debería ser 'Bloqueado'");
    }

    @Test
    public void testAccesoDenegadoPorEscaneo() {
        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Carl", "pasaporte456");

        sistemaFrontera.verificar(viajero);
        assertEquals("Bloqueado", sistemaFrontera.obtenerEstado(), "El estado del viajero deberia ser 'Bloqueado'");
    }
}
