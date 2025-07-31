public class Gerente extends Empregado{
    
    public Gerente(double salarioFixo) {
        super(salarioFixo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if (departamento.alcancouMeta()) {
            bonus += getSalarioFixo() * 0.2; // 20% do salário fixo
            bonus += (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01; // 1% da diferença
        }
        return bonus;
    }

}
