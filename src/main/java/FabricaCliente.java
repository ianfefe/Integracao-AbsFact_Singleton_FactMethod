public class FabricaCliente {

    private FabricaCliente() {};
    private static FabricaCliente instance = new FabricaCliente();
    public static FabricaCliente getInstance() {
        return instance;
    }

    public FabricaAbstrata getFabricaAbstrata(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}
