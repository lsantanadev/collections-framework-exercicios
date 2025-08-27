package List.catalogodelivros.test;

import List.catalogodelivros.dominio.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivroTest {
    public static void main(String[] args) {
        List<Livro> acervo = new ArrayList<>();

        acervo.add(new Livro("Entendendo Algoritmos", "Aditya Y.", 2017));
        acervo.add(new Livro("Code Complete", "Steve McConnell", 1993));
        acervo.add(new Livro("The Pragmatic Programmer", "Andrew Hunt", 1999));
        acervo.add(new Livro("Código Limpo", "Uncle Bob", 2008));
        acervo.add(new Livro("Estrutura e Interpretação de Programas de Computador", "Harold Abelson", 1984));
        acervo.add(new Livro("Sistemas Operacionais Modernos", "Tenenbaum", 2001));

        Collections.sort(acervo);

        //imprime por ano de publicação
        for (Livro livro : acervo) {
            System.out.println(livro);
        }

    }
}
