/*
 * Crie a classe Produto:
Possui os atributos nome, preco e percentualMarkup com valor inicial de 10 (10%).
Inclua um atributo Supplier com nome precoComMarkup que retorne um valor Double com o preço do produto acrescido do índice de markup.
Inclua um atributo Consumer com o nome atualizarMarkup que recebe um valor Double e modifica o valor do atributo percentualMarkup do objeto.
 */
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
