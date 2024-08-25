package list.listaDeTarefas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
        private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();

    }
    public void adicionarTarefa(String titulo, String descricao){
        listaTarefa.add(new Tarefa(titulo,descricao));
    }
    public void removerTarefa(String titulo){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefa ) {
            if(t.getTitulo().equalsIgnoreCase(titulo)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa t : listaTarefa) {
            System.out.println("Título: " + t.getTitulo() + ", Descrição: " + t.getDescricao());
        }
    }

}
