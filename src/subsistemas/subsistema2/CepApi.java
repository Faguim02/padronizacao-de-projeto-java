package subsistemas.subsistema2;

public class CepApi {
    private static CepApi instence = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstence() {
        return instence;
    }

    public String recuperarCidade(String cep){
        return "Salgueiro";
    }
    public String recuperarEstado(String cep){
        return "PE";
    }
}
