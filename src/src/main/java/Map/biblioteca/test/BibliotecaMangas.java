package Map.test;

import Map.dominio.Consumidor;
import Map.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaMangas {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Leonardo", "1234567890", 27);
        Consumidor c2 = new Consumidor("Ana", "1234567880", 29);

        Manga naruto = new Manga(1L, "Naruto Shippuden", 99);
        Manga hunter = new Manga(2L, "Hunter x Hunter", 88);
        Manga aot = new Manga(3L, "Attack on Titan", 79.90);
        Manga bleach = new Manga(4L, "Bleach", 66.99);
        Manga boruto = new Manga(5L, "Boruto", 50.98);

        List<Manga> consumidor1 = List.of(naruto, hunter, aot);
        List<Manga> consumidor2 = List.of(bleach, boruto, aot);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(c1, consumidor1);
        consumidorMangaMap.put(c2, consumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            double total = 0;
            System.out.println("-" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("--" + manga.getNome() + " | R$" + manga.getPreco());
                total += manga.getPreco();
            }
            System.out.println("Total gasto: R$"+ total);
            System.out.println("-----------------------");
        }

    }
}
