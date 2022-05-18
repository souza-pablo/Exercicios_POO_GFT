package gft.starter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        Map<String, Integer> listaPessoas = new HashMap<>(){{
            put("João", 15);
            put("Leandro", 21);
            put("Paulo", 17);
            put("Jessica", 18);
        }};
        System.out.println(listaPessoas);
        System.out.println("Tamanho da lista antes da exlusão: " + listaPessoas.size());
        Iterator<Integer> iterator1 = listaPessoas.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 18) iterator1.remove();
        }
        System.out.println(listaPessoas);
        System.out.println("Tamanho da lista depois da exlusão: " + listaPessoas.size());
    }
}
