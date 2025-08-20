package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double percentual = peso > 2000 ? 0.07 : 0.045;
        double valorFrete = valor * percentual;
        return new Frete(valorFrete, TipoProvedorFrete.JADLOG);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
