import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Emite contrato PF", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Emite procuracao PF", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Emite contrato PJ", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaCliente.getInstance().getFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Emite procuracao PJ", cliente.emitirProcuracao());
    }
}