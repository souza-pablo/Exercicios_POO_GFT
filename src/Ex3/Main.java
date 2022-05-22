package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> magia = new ArrayList<>();
        magia.add("Ventania Uivante");
        magia.add("Zéfiro");
        magia.add("Olho da Tempestade");

        List<String> habilidade = new ArrayList<>();
        habilidade.add("Dizimar");
        habilidade.add("Ataque Mutilador");
        habilidade.add("Apreender");

        Mago m1 = new Mago("Janna", 356, 302, 0, 335, 49, 1,magia);
        Guerreiro g1 = new Guerreiro("Darius", 582, 263, 0, 301, 67, 1, habilidade);

        m1.attack();
        g1.attack();

        m1.lvlUp();
        g1.lvlUp();

        System.out.println("Lista de Magias: " + m1.getMagia());
        m1.aprenderMagia("Monção");
        System.out.println("Lista de Magias: " + m1.getMagia());
        m1.attack();

        System.out.println("Lista de Habilidades: " + g1.getHabilidade());
        g1.aprenderHabilidade("Guilhotina de Noxus");
        System.out.println("Lista de Habilidades: " + g1.getHabilidade());
        g1.attack();

        m1.lvlUp();
        g1.lvlUp();

        System.out.println("Quantidade de personagens criados: " + Personagem.totalPersonagens);
        Mago m2 = new Mago();
        System.out.println("Quantidade de personagens criados: " + Personagem.totalPersonagens);
        Guerreiro g2 = new Guerreiro();
        System.out.println("Quantidade de personagens criados: " + Personagem.totalPersonagens);
    }
}
