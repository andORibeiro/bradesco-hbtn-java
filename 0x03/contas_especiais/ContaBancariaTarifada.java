import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    private int quantidadeTransacoes;

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.saldo = super.getSaldo() - 0.10;
        super.depositar(valor);
        quantidadeTransacoes++;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.saldo = super.getSaldo() - 0.10;
        super.sacar(valor);
        quantidadeTransacoes++;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
