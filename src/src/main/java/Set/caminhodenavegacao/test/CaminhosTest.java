package Set.caminhodenavegacao.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CaminhosTest {
    public static void main(String[] args) {
        List<String> paginasVisitadas = List.of(
                "Home",
                "Produtos",
                "Serviços",
                "Home",
                "Contato",
                "Produtos");

        Set<String> relatorio = new LinkedHashSet<>();
        relatorio.addAll(paginasVisitadas);

        for (String s : relatorio) {
            System.out.print(s + "/");
        }

    }
}
