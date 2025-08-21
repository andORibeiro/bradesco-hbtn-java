import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor>0){
            saldo += valor;
        }else{
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para saque deve ser maior que 0");
        }else if(valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else{
            saldo -= valor;
        }
    }

    public double calcularTarifaMensal(){
        double tarifaFixa = 10.0;
        double tarifaVariavel = saldo * 0.1;
        return Math.min(tarifaFixa, tarifaVariavel); //retorna o menor de dois valores
    }

    public double calcularJurosMensal(){
        if(saldo < 0){
            return 0;
        }
        double taxaJurosMensal = (taxaJurosAnual / 100) / 12;
        return saldo * taxaJurosMensal;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    
}
