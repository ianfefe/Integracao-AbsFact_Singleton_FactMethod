import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaAbstrataTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PF");
        assertEquals("Emite contrato PF", fabrica.createContrato().emitir());
    }
    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PJ");
        assertEquals("Emite contrato PJ", fabrica.createContrato().emitir());
    }
    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PF");
        assertEquals("Emite procuracao PF", fabrica.createProcuracao().emitir());
    }
    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PJ");
        assertEquals("Emite procuracao PJ", fabrica.createProcuracao().emitir());
    }
}
