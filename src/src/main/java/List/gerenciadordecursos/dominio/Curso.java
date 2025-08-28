package List.gerenciadordecursos.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Long id;
    private String professorResponsavel;
    private List<Aluno> alunosMatriculados;

    public Curso(String nome, Long id, String professorResponsavel) {
        this.nome = nome;
        this.id = id;
        this.professorResponsavel = professorResponsavel;
        this.alunosMatriculados = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void removerAluno(String matricula) {
        alunosMatriculados.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public void obterAlunosOrdenadosPorNome() {
        BuscaOrdenadaPorNome buscaOrdenadaPorNome = new BuscaOrdenadaPorNome();
        alunosMatriculados.sort(buscaOrdenadaPorNome);
        System.out.println(alunosMatriculados);
    }

    public void buscarAlunosPorMatricula(String matricula) {
        Collections.sort(alunosMatriculados);
        Aluno chaveMatricula = new Aluno(null, matricula);
        int matriculaEncontrada = Collections.binarySearch(alunosMatriculados, chaveMatricula);

        if (matriculaEncontrada >= 0) {
            System.out.println("Aluno encontrado: " + alunosMatriculados.get(matriculaEncontrada));
        } else {
            System.out.println("Aluno com matricula " + matricula + " não encontrado");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome) && Objects.equals(id, curso.id) && Objects.equals(professorResponsavel, curso.professorResponsavel) && Objects.equals(alunosMatriculados, curso.alunosMatriculados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id, professorResponsavel, alunosMatriculados);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", professorResponsavel='" + professorResponsavel + '\'' +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
