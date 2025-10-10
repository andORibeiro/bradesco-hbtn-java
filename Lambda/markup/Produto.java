public class Produto {
    private String nome;
    private Double preco;
    private Double percentualMarkup = 10d;

    public java.util.function.Supplier<Double> precoComMarkup = () -> {
        return this.preco + (this.preco * (this.percentualMarkup / 100));
    };

    public java.util.function.Consumer<Double> atualizarMarkup = (novoPercentual) -> {
        this.percentualMarkup = novoPercentual;
    };

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
