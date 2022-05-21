package Ex3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

    private List<String> habilidade;

    public void lvlUp(){
        this.setXp(getXp() + 128.3f);
        this.setLevel(getLevel() + 1);
        this.setVida(getVida() + 99);
        this.setMana(getMana() + 37);
        this.setInteligencia(getInteligencia() + 41);
        this.setForca(getForca() + 82);
        System.out.println("Subiu de nível! Status atualizados: ");
    }

    public void attack(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(300);
        System.out.println(("Dano causado: " + this.getForca() * this.getLevel()) + numeroAleatorio);
    }

    public void aprenderHabilidade(String habilidade){

    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

}
