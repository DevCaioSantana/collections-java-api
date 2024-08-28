package list.ordenacaoDePessoas;

import java.util.List;

public class TesteOrdenacaoPessoas {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("João", 25, 1.75);
        ordenacaoPessoas.adicionarPessoa("Maria", 30, 1.60);
        ordenacaoPessoas.adicionarPessoa("Ana", 22, 1.70);
        ordenacaoPessoas.adicionarPessoa("Carlos", 28, 1.80);

        // Ordenando por idade e exibindo os resultados
        System.out.println("Pessoas ordenadas por idade:");
        List<Pessoa> pessoasPorIdade = ordenacaoPessoas.ordenarPorIdade();
        for (Pessoa p : pessoasPorIdade) {
            System.out.println(p);
        }

        // Ordenando por altura e exibindo os resultados
        System.out.println("\nPessoas ordenadas por altura:");
        List<Pessoa> pessoasPorAltura = ordenacaoPessoas.ordenarPorAltura();
        for (Pessoa p : pessoasPorAltura) {
            System.out.println(p);
        }
    }
}
