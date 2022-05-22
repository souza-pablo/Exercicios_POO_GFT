package Ex3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

    private List<String> magia;

    public Mago() {
        Personagem.totalPersonagens++;
    }

    public void lvlUp() {
        this.setXp(getXp() + 128.3f);
        this.setLevel(getLevel() + 1);
        this.setVida(getVida() + 78);
        this.setMana(getMana() + 64);
        this.setInteligencia(getInteligencia() + 58);
        this.setForca(getForca() + 65);
        System.out.println("Mago subiu de nível! Status atualizados: " + "Nome = '" + this.getNome() + '\'' +
                ", Vida = " + this.getVida() +
                ", Mana = " + this.getMana() +
                ", Xp = " + this.getXp() +
                ", Inteligencia = " + this.getInteligencia() +
                ", Força = " + this.getForca() +
                ", Level = " + this.getLevel());
    }

    public void attack() {
        Random randomInt = new Random();
        Random randomString = new Random();
        int numeroAleatorio = randomInt.nextInt(300);
        String magiaAleatoria = magia.get(randomString.nextInt(magia.size()));
        System.out.println(this.getNome() + ", usar magia " + magiaAleatoria + "!");
        System.out.println(("Dano causado: " + this.getInteligencia() * this.getLevel()) + numeroAleatorio);
    }

    public void aprenderMagia(String magia) {
        this.magia.add(magia);
        System.out.println("O mago " + this.getNome() + " acaba de aprender uma nova magia: " + magia + "!");
    }

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
        Personagem.totalPersonagens++;
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

}
