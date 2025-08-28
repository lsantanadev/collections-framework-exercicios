package List.catalogodelivros.dominio;

import java.util.*;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void removerLivro(Livro livro) {
        Iterator<Livro> livroIterator = acervo.iterator();
        while (livroIterator.hasNext()) {
            if (livroIterator.next().equals(livro)) {
                livroIterator.remove();
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void obterLivroOrdenadosPorAno(){
        Collections.sort(acervo);
        System.out.println(acervo);
    }

    public void obterTotalLivros(){
        int size = acervo.size();
        System.out.println("Quantidade de livros cadastrados: "+size);
    }

    public String toString() {
        return "Biblioteca{" +
                "acervo=" + acervo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(acervo, that.acervo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(acervo);
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }
}
