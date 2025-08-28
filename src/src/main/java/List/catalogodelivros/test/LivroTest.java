package List.catalogodelivros.test;

import List.catalogodelivros.dominio.Biblioteca;
import List.catalogodelivros.dominio.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Entendendo Algoritmos", "Aditya Y.", 2017);
        Livro livro2 = new Livro("Code Complete", "Steve McConnell", 1993);
        Livro livro3 = new Livro("The Pragmatic Programmer", "Andrew Hunt", 1999);
        Livro livro4 = new Livro("Código Limpo", "Uncle Bob", 2008);
        Livro livro5 = new Livro("Estrutura e Interpretação de Programas de Computador", "Harold Abelson", 1984);
        Livro livro6 = new Livro("Sistemas Operacionais Modernos", "Tenenbaum", 2001);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);

        biblioteca.removerLivro(livro1);
        biblioteca.obterLivroOrdenadosPorAno();

        biblioteca.obterTotalLivros();
    }
}
