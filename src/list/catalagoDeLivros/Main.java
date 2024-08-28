package list.catalagoDeLivros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoDeLivros catalogo = new CatalogoDeLivros();

        catalogo.adicionarLivro("Livro 1","Marcos",2001);
        catalogo.adicionarLivro("Livro 2","Marcos",2009);
        catalogo.adicionarLivro("Livro 3","Julio",2005);
        catalogo.adicionarLivro("Livro 4","Pedro",2013);

        System.out.println(catalogo.pesquisarPorAutor("Marcos"));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000,2005));

        System.out.println(catalogo.pesquisarPorTitulo("Livro 4"));
        System.out.println(catalogo);
    }
}
