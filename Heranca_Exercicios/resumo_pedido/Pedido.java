public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    
    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
public void apresentarResumoPedido() {
    System.out.println("------- RESUMO PEDIDO -------");
    for (ItemPedido item : itens) {
        if (item != null) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    item.getProduto().getClass().getSimpleName(),
                    item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(),
                    item.getQuantidade(),
                    item.obterSubtotal());
        }
    }
    System.out.printf("----------------------------\n");
    System.out.printf("DESCONTO: %.2f\n", percentualDesconto);
    System.out.printf("TOTAL PRODUTOS: %.2f\n", calcularTotal());
    System.out.printf("----------------------------\n");
    System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
    System.out.printf("----------------------------\n");
}

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            if (item != null) {
                total += item.obterSubtotal();
            }
        }
        // Aplica o desconto diretamente no total
        return total - (total * percentualDesconto / 100);
    }   

    
    // Getters
    public double getPercentualDesconto() {
        return percentualDesconto;
    }
    
    public ItemPedido[] getItens() {
        return itens;
    }
}
