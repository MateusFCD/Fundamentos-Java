package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Levi", 10);
        notas.put("Dandara", 10);
        notas.put("Mateus", 9);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
