package List.listafuncionarios.test;

import List.listafuncionarios.dominio.Empresa;
import List.listafuncionarios.dominio.Funcionario;

import java.util.Comparator;

class NomeComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getNome().compareTo(f2.getNome());
    }
}

class SalarioOrdenadoComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        if (f1.getSALARIO() > f2.getSALARIO()) {
            return -1;
        } else if (f1.getSALARIO() == f2.getSALARIO()) {
            return 0;
        } else {
            return 1;
        }
    }
}

public class EmpresaTest01 {
    public static void main(String[] args) {
        NomeComparator nomeComparator = new NomeComparator();
        SalarioOrdenadoComparator salarioOrdenadoComparator = new SalarioOrdenadoComparator();
        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario("Leonardo", "Software Developer", 8000.00);
        Funcionario f2 = new Funcionario("Daniela", "QA", 5000.00);
        Funcionario f3 = new Funcionario("Leandro", "DBA", 10000.00);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);

        System.out.println("Funcionarios ordenados por nome: ");
        empresa.getFuncionarioList().sort(nomeComparator);
        System.out.println(empresa.getFuncionarioList());

        System.out.println("Funcionarios ordenados por salario: ");
        empresa.getFuncionarioList().sort(salarioOrdenadoComparator);
        System.out.println(empresa.getFuncionarioList());
    }
}
