/*Interface genérica Armazenavel que possui os métodos:
adicionarAoInventario: recebe um nome e um valor do tipo genérico.
obterDoInventario: recebe um nome e retorna um valor do tipo genérico. */

public interface Armazenavel<T> {
    void adicionarAoInventario(String nome, T valor);
    T obterDoInventario(String nome);
}
