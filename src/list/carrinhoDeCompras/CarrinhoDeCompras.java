package list.carrinhoDeCompras;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
    carrinho.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        Iterator<Item> iterator = carrinho.iterator();
        while(iterator.hasNext()){
            Item item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)){
                iterator.remove();
            }
        }

    }
    public void calcularValorTotal(){
        double valorTotal=0;
        for (Item item : carrinho){
           valorTotal+= item.getQuantidade()*item.getPreco();
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("O valor total do seu carrinho: $" + df.format(valorTotal));
    }

    public void exibirItens(){
        System.out.println("Seu carrinho contem:");
        for (Item item : carrinho){
            System.out.println("Item: "+item.getNome()+" ,preço: $"+item.getPreco()+" ,quantidade: "+item.getQuantidade());
        }
    }
}
