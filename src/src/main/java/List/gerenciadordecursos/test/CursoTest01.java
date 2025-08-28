package List.gerenciadordecursos.test;

import List.gerenciadordecursos.dominio.Aluno;
import List.gerenciadordecursos.dominio.Curso;

public class CursoTest01 {
    public static void main(String[] args) {
        Curso curso = new Curso("Algoritmos", 12458L, "Prof. Isidro");

        Aluno a1 = new Aluno("Leonardo", "745896225");
        Aluno a2 = new Aluno("Daniel", "856478962");
        Aluno a3 = new Aluno("Paula", "745832586");

        curso.adicionarAluno(a1);
        curso.adicionarAluno(a2);
        curso.adicionarAluno(a3);

        curso.obterAlunosOrdenadosPorNome();
        curso.buscarAlunosPorMatricula("745832586");

        curso.removerAluno("745832586");
        curso.obterAlunosOrdenadosPorNome();

        curso.buscarAlunosPorMatricula("85696552");
    }
}
