package list.catalagoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    List<Livro> catalogoDeLivros;

    public CatalogoDeLivros() {
        this.catalogoDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        for(Livro L : catalogoDeLivros){
            if (L.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(L);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        for(Livro L : catalogoDeLivros){
            if (L.getAnoPublicacao() >= anoInicial &&  L.getAnoPublicacao() <= anoFinal  ){
                livrosPorIntervalo.add(L);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro L : catalogoDeLivros){
            if (L.getTitulo().equalsIgnoreCase(titulo)){
                return L;
            }
        }
        return null;
    }
}
