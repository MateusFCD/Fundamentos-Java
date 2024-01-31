package primeirasAulas;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        // Set
        Set<String> nomes = new HashSet<>();
        nomes.add("Levi");
        nomes.add("Mateus");
        nomes.add("Dandara");

        // System.out.println(nomes);
        // for (String nome : nomes) {
        // System.out.println(nome);
        // }
        nomes.forEach(nome -> System.out.println("O nome é " + nome));
        nomes.forEach(System.out::println);
    }
}
