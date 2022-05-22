package Ex3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

    private List<String> habilidade;

    public Guerreiro() {
        Personagem.totalPersonagens++;
    }

    public void lvlUp() {
        this.setXp(getXp() + 128.3f);
        this.setLevel(getLevel() + 1);
        this.setVida(getVida() + 99);
        this.setMana(getMana() + 37);
        this.setInteligencia(getInteligencia() + 41);
        this.setForca(getForca() + 82);
        System.out.println("Guerreiro subiu de nível! Status atualizados: " + "Nome = '" + this.getNome() + '\'' +
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
        String habilidadeAleatoria = habilidade.get(randomString.nextInt(habilidade.size()));
        System.out.println(this.getNome() + ", usar habilidade " + habilidadeAleatoria + "!");
        System.out.println(("Dano causado: " + this.getForca() * this.getLevel()) + numeroAleatorio);
    }

    public void aprenderHabilidade(String habilidade) {
        this.habilidade.add(habilidade);
        System.out.println("O guerreiro " + this.getNome() + " acaba de aprender uma nova habilidade: " + habilidade + "!");
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = habilidade;
        Personagem.totalPersonagens++;
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

}
