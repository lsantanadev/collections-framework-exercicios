package Map.dicionario.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicionarioInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("vc", "você");
        dicionario.put("teklado", "teclado");
        dicionario.put("kopo", "copo");
        dicionario.put("pesoa", "pessoa");
        dicionario.put("selular", "celular");

        System.out.println("==== \uD83E\uDDE0 DICIONÁRIO INTELIGENTE ====");

        int opcao;
        do {
            System.out.println("""
                    1. Corrigir palavra
                    2. Adicionar nova correção
                    3. Exibir todas as correções
                    0. Sair
                    Escolha uma opção:
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a palavra incorreta: ");
                    String palavra = sc.nextLine().trim().toLowerCase();

                    if (dicionario.containsKey(palavra)) {
                        System.out.println("Correção: " + dicionario.get(palavra));
                    } else {
                        System.out.println("Nenhuma correção encontrada para a palavra '" + palavra + "'");
                    }
                    break;

                case 2:
                    System.out.println("Palavra incorreta: ");
                    String incorreta = sc.nextLine().trim().toLowerCase();

                    System.out.println("Correção: ");
                    String correta = sc.nextLine().trim().toLowerCase();

                    dicionario.putIfAbsent(incorreta, correta);
                    System.out.println("Correção adicionada");
                    break;

                case 3:
                    System.out.println("\nTodas as correções: ");
                    for (Map.Entry<String, String> entry : dicionario.entrySet()) {
                        System.out.println("- " + entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
