package Ex6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> listaPessoas = new HashMap<>(){{
            put("Leandro", 21);
            put("Jessica", 18);
        }};
        System.out.println(listaPessoas);
        System.out.println("Conferindo se o nome Jessica está na lista... " + listaPessoas.containsKey("Jessica") +
                ". Sua idade é " + listaPessoas.get("Jessica"));
    }
}
