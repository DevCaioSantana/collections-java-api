package list.listaDeTarefas;


public class Main {
    public static void main(String[] args) {
        // Criando uma instância de ListaTarefa
        ListaTarefa minhaLista = new ListaTarefa();

        // Adicionando tarefas à lista
        minhaLista.adicionarTarefa("Estudar", "Estudar para a prova de matemática");
        minhaLista.adicionarTarefa("Comprar", "Comprar ingredientes para o jantar");
        minhaLista.adicionarTarefa("Exercícios", "Fazer 30 minutos de exercícios");
        minhaLista.adicionarTarefa("Leitura", "Ler 20 páginas de um livro");

        // Exibindo as descrições de todas as tarefas
        System.out.println("Tarefas na lista:");
        minhaLista.obterDescricoesTarefas();

        // Removendo uma tarefa
        minhaLista.removerTarefa("Estudar");

        // Exibindo as descrições das tarefas após a remoção
        System.out.println("\nTarefas na lista após remover 'Estudar':");
        minhaLista.obterDescricoesTarefas();

        // Exibindo o número total de tarefas restantes
        int totalTarefas = minhaLista.obterNumeroTotalTarefas();
        System.out.println("\nNúmero total de tarefas: " + totalTarefas);
    }
}

