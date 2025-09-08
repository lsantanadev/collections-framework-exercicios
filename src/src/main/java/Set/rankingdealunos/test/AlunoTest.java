package Set.rankingdealunos.test;

import Set.rankingdealunos.dominio.Aluno;
import Set.rankingdealunos.dominio.AlunoNotaComparator;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AlunoTest {
    public static void main(String[] args) {
        NavigableSet<Aluno> alunos = new TreeSet<>(new AlunoNotaComparator());

        Aluno a1 = new Aluno("Leonardo", 9.8);
        Aluno a2 = new Aluno("Ana", 9.8);
        Aluno a3 = new Aluno("Paula", 9.8);
        Aluno a4 = new Aluno("Leandro", 8.6);
        Aluno a5 = new Aluno("José", 6.5);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
