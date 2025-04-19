import gestorFrontera.Seguridad;
import gestorFrontera.SistemaFrontera;
import gestorFrontera.Viajero;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
public class Pasos {
    private SistemaFrontera sistema;
    private Viajero viajero;

    @Given("que el viajero tiene un pasaporte valido")
    public void el_viajero_tiene_un_pasaporte_valido() {
        viajero = new Viajero("Juan", "pasaporte123");
        Seguridad seguridad = new Seguridad();
        sistema = new SistemaFrontera(seguridad);
    }
    @When("el viajero intenta pasar la frontera")
    public void el_viajero_intenta_pasar_la_frontera() {
        sistema.verificar(viajero);
    }

    @Then("el viajero deberia haber sido autorizado y entrar al pais")
    public void el_viajero_deberia_haber_sido_autorizado_y_entrar_al_pais() {
        assertEquals("Dentro del pais", sistema.obtenerEstado());
    }

    @Then("el viajero deberia ser rechazado y no poder entrar al pais")
    public void el_viajero_deberia_ser_rechazado_y_no_poder_entrar_al_pais() {
        assertEquals("Esta prohibido entrar al pais", sistema.obtenerEstado());
    }
}
