/*
 * Crie a classe ConsultaProdutos que possui um método estático filtrar que recebe uma lista de produtos e um objeto do tipo CriterioFiltro e retorna uma lista de produtos filtrada pelo critério passado. Esse método deve percorrer a lista de produtos e retornar apenas aqueles produtos onde testar do critério aplicado sobre o produto retorne true.
*/

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
        List<Produto> produtosFiltrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (criterio.testar(produto)) {
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}
