package List.listafuncionarios.dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    private List<Funcionario> funcionarioList;

    public Empresa() {
        this.funcionarioList = new LinkedList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioList.add(funcionario);
    }

    public void removerFuncionario(String nome) {
        funcionarioList.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empresa empresa)) return false;
        return Objects.equals(funcionarioList, empresa.funcionarioList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(funcionarioList);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "funcionarioList=" + funcionarioList +
                '}';
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }
}
