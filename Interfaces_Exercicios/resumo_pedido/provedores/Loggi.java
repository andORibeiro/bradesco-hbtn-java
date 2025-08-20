package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double percentual = peso > 5000 ? 0.12 : 0.04;
        double valorFrete = valor * percentual;
        return new Frete(valorFrete, TipoProvedorFrete.LOGGI);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
