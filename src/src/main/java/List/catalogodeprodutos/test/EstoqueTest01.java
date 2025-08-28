package List.catalogodeprodutos.test;

import List.catalogodeprodutos.dominio.Estoque;
import List.catalogodeprodutos.dominio.Produto;

public class EstoqueTest01 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto p3 = new Produto(55L, "Calculadora", 100.99);
        Produto p4 = new Produto(88L, "Lápis", 1.50);
        Produto p2 = new Produto(6L, "Fone de ouvido", 55.99);
        Produto p1 = new Produto(2L, "Caneta", 2.50);

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.adicionarProduto(p4);

        estoque.removerProduto(88L);
        estoque.obterProdutosOrdenadosPorId();
        estoque.buscarProdutosPorId(2L);
    }
}
