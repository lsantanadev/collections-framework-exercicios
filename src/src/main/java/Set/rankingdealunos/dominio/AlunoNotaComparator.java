package Set.rankingdealunos.dominio;

import java.util.Comparator;

public class AlunoNotaComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno n1, Aluno n2) {

        int notaCompare = Double.compare(n2.getNota(), n1.getNota());

        if (notaCompare != 0)
            return notaCompare;

        return n1.getNome().compareTo(n2.getNome());
    }
}
