package list.carrinhoDeCompras;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.adicionarItem("Escova", 12.50,5);
        meuCarrinho.adicionarItem("Pipoca", 9.20,3);
        meuCarrinho.adicionarItem("Ketchup", 18.50,1);

        meuCarrinho.exibirItens();
        meuCarrinho.calcularValorTotal();
        meuCarrinho.removerItem("Ketchup");
        meuCarrinho.exibirItens();
        meuCarrinho.calcularValorTotal();
    }
}
