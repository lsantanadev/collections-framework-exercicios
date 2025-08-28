package List.listafuncionarios.dominio;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String cargo;

    private final double SALARIO;

    public Funcionario(String nome, String cargo, double SALARIO) {
        this.nome = nome;
        this.cargo = cargo;
        this.SALARIO = SALARIO;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Funcionario that)) return false;
        return Double.compare(SALARIO, that.SALARIO) == 0 && Objects.equals(nome, that.nome) && Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cargo, SALARIO);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", SALARIO=" + SALARIO +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSALARIO() {
        return SALARIO;
    }
}
