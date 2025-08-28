# Collections Framework 

## Intuito do repositório 
O propósito do repositório é apresentar a Collections Framework através de exemplos práticos

## Como foi dividido o conteúdo
O conteúdo foi divido em três partes, com exemplos dos conceitos mais utilizados no mercado, sendo eles: o Map, Set e List

## Subdivisão dos exemplos
### List

1 – Catálogo de Livros

Crie uma classe `Livro` com atributos `titulo`, `autor` e `anoPublicacao`.  
Crie uma classe `Biblioteca` que possua uma lista de livros.

Implemente os seguintes métodos:
- `adicionarLivro(Livro livro)`
- `removerLivro(String titulo)`
- `obterLivrosOrdenadosPorAno()`
- `obterTotalLivros()`

-> A solução deste desafio está no arquivo [catalogodelivros](https://github.com/lsantanadev/collections-framework-exercicios/blob/b84653105dbebce502cfaaeb476af182ec3f4aa9/src/src/main/java/List/catalogodelivros) 

# Exercício 2 – Lista de Funcionários

Crie uma classe `Funcionario` com atributos `nome`, `cargo` e `salario`.  
Crie uma classe `Empresa` que possua uma lista encadeada de funcionários.

Implemente os seguintes métodos:
- `adicionarFuncionario(Funcionario funcionario)`
- `removerFuncionario(String nome)`
- `obterFuncionariosOrdenadosPorNome()`
- `obterFuncionariosOrdenadosPorSalario()`  

-> A solução deste desafio está no arquivo [listafuncionarios](https://github.com/lsantanadev/collections-framework-exercicios/blob/2cd534f0f7b15f069056671ac7edc93a0c0b273c/src/src/main/java/List/listafuncionarios)

# Exercício 3 – Catálogo de Produtos

Crie uma classe `Produto` com atributos `id`, `nome` e `preco`.  
Crie uma classe `Estoque` que possua uma lista de produtos.

Implemente os seguintes métodos:
- `adicionarProduto(Produto produto)`
- `removerProduto(Long id)`
- `buscarProdutoPorId(Long id)` usando busca binária.
- `obterProdutosOrdenadosPorId()`  

-> A solução deste desafio está no arquivo [catalogodeprodutos](https://github.com/lsantanadev/collections-framework-exercicios/blob/5ab1b36e40727fb0ea4810d079bb57e71942d42a/src/src/main/java/List/catalogodeprodutos)
