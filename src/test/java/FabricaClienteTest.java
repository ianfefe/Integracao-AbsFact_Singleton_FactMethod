import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FabricaClienteTest {

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInválida() {
        try {
            FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("Nenhuma");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inválida", e.getMessage());
        }
    }
}
