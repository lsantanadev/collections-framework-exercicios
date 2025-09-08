# Collections Framework

## Intuito do repositório

O propósito do repositório é apresentar a Collections Framework através de exemplos práticos

## Como foi dividido o conteúdo

O conteúdo foi divido em três partes, com exemplos dos conceitos mais utilizados no mercado, sendo eles: o Map, Set e
List

## Subdivisão dos exemplos

### List

#### 1 – Catálogo de Livros

Crie uma classe `Livro` com atributos `titulo`, `autor` e `anoPublicacao`.  
Crie uma classe `Biblioteca` que possua uma lista de livros.

Implemente os seguintes métodos:

- `adicionarLivro(Livro livro)`
- `removerLivro(String titulo)`
- `obterLivrosOrdenadosPorAno()`
- `obterTotalLivros()`

-> A solução deste desafio está no
arquivo [catalogodelivros](https://github.com/lsantanadev/collections-framework-exercicios/blob/b84653105dbebce502cfaaeb476af182ec3f4aa9/src/src/main/java/List/catalogodelivros)

#### Exercício 2 – Lista de Funcionários

Crie uma classe `Funcionario` com atributos `nome`, `cargo` e `salario`.  
Crie uma classe `Empresa` que possua uma lista encadeada de funcionários.

Implemente os seguintes métodos:

- `adicionarFuncionario(Funcionario funcionario)`
- `removerFuncionario(String nome)`
- `obterFuncionariosOrdenadosPorNome()`
- `obterFuncionariosOrdenadosPorSalario()`

-> A solução deste desafio está no
arquivo [listafuncionarios](https://github.com/lsantanadev/collections-framework-exercicios/blob/2cd534f0f7b15f069056671ac7edc93a0c0b273c/src/src/main/java/List/listafuncionarios)

#### Exercício 3 – Catálogo de Produtos

Crie uma classe `Produto` com atributos `id`, `nome` e `preco`.  
Crie uma classe `Estoque` que possua uma lista de produtos.

Implemente os seguintes métodos:

- `adicionarProduto(Produto produto)`
- `removerProduto(Long id)`
- `buscarProdutoPorId(Long id)` usando busca binária.
- `obterProdutosOrdenadosPorId()`

-> A solução deste desafio está no
arquivo [catalogodeprodutos](https://github.com/lsantanadev/collections-framework-exercicios/blob/5ab1b36e40727fb0ea4810d079bb57e71942d42a/src/src/main/java/List/catalogodeprodutos)

#### Exercício 4 – Sistema de Cursos

Crie uma classe `Aluno` com atributos `nome` e `matricula`.  
Crie uma classe `Curso` com atributos `nome`, `codigo` e uma lista de alunos.

Implemente os seguintes métodos:

- `adicionarAluno(Aluno aluno)`
- `removerAluno(String matricula)`
- `obterAlunosOrdenadosPorNome()`
- `buscarAlunoPorMatricula(String matricula)` (usando busca binária)

-> A solução deste desafio está no
arquivo [gerenciadordecursos](https://github.com/lsantanadev/collections-framework-exercicios/blob/9b7b823b2856feee17ef1c07fbd141a14b7152fc/src/src/main/java/List/gerenciadordecursos)

### Set

#### Exercício 1 - HashSet de Contatos Únicos

Crie uma classe `Contato` com os atributos `nome` e `email`. Nesta classe, sobrescreva os métodos `equals()` e
`hashCode()` para que a lógica de igualdade seja definida **apenas** pelo atributo `email`. Em seguida, crie uma classe
de teste para instanciar um `HashSet<Contato>`, adicione diferentes objetos `Contato` a ele, incluindo um com e-mail
duplicado, e imprima o resultado final para confirmar que a duplicata não foi inserida.

-> A solução deste desafio está no
arquivo [gerenciadordecontatosunicos](https://github.com/lsantanadev/collections-framework-exercicios/blob/f3a70a330b9ff46b871ed17c868b87f4293093d5/src/src/main/java/Set/gerenciadordecontatosunicos)

#### Exercício 2: Ranking de Alunos

Crie uma classe `Aluno` com os atributos `nome` (String) e `nota` (double). Em seguida, crie uma classe separada que
implemente `Comparator<Aluno>` para definir uma regra de ordenação customizada. A ordenação deve ser pela **maior nota
** (decrescente) e, como critério de desempate, pelo **nome em ordem alfabética** (crescente). Por fim, em uma classe de
teste, instancie um `TreeSet` passando seu `Comparator` no construtor, adicione vários objetos `Aluno` e imprima a
coleção para verificar se o ranking foi gerado corretamente.

-> A solução deste desafio está no
arquivo [rankingdealunos](https://github.com/lsantanadev/collections-framework-exercicios/blob/360bf0cadab6f9f82c245c08fc56d4fd2be43aa9/src/src/main/java/Set/rankingdealunos)
