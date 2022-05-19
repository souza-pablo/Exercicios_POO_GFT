package Ex4;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> listaPessoas = new LinkedHashMap<>(){{
            put("João", 15);
            put("Leandro", 21);
            put("Paulo", 17);
            put("Jessica", 18);
        }};
        System.out.println(listaPessoas);

        Integer maiorIdade = Collections.max(listaPessoas.values());
        Set<Map.Entry<String, Integer>> entries = listaPessoas.entrySet();
        String pessoaMaisVelha = "";

        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue().equals(maiorIdade)) pessoaMaisVelha = entry.getKey();
        }
        System.out.println("A pessoa mais velha é: " + pessoaMaisVelha);

    }
}
