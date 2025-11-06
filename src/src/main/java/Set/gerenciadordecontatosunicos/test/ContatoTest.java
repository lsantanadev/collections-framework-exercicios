package Set.gerenciadordecontatosunicos.test;

import Set.gerenciadordecontatosunicos.dominio.Contato;

import java.util.HashSet;
import java.util.Set;

public class ContatoTest {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com");
        Contato c2 = new Contato("Leandro", "leandro@email.com");
        Contato c3 = new Contato("Leandro Silva", "leandro@email.com");
        Contato c4 = new Contato("Leonardo", "leonardo@email.com");
        Contato c5 = new Contato("Leonardo", "leonardosilva@email.com");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(c4);
        contatos.add(c5);

        contatos.forEach(System.out::println);


    }
}
