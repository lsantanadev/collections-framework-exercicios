package List.catalogodeprodutos.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estoque {
    List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }

    public void buscarProdutosPorId(Long id) {
        Collections.sort(produtos);
        Produto chaveDeBusca = new Produto(id, null, 0);
        int index = Collections.binarySearch(produtos, chaveDeBusca);

        if (index >= 0) {
            System.out.println("Produto encontrado: " + produtos.get(index));
        } else {
            System.out.println("Produto com ID: " + id + " não encontrado");
        }
    }

    public void obterProdutosOrdenadosPorId() {
        Collections.sort(produtos);
        System.out.println(produtos);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produtos=" + produtos +
                '}';
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
