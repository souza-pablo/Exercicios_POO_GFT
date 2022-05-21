package Ex3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{

    private List<String> magia;

    public void lvlUp(){
        this.setXp(getXp() + 128.3f);
        this.setLevel(getLevel() + 1);
        this.setVida(getVida() + 78);
        this.setMana(getMana() + 64);
        this.setInteligencia(getInteligencia() + 58);
        this.setForca(getForca() + 65);
        System.out.println("Subiu de nível! Status atualizados: ");
    }

    public void attack(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(300);
        System.out.println(("Dano causado: " + this.getInteligencia() * this.getLevel()) + numeroAleatorio);
    }
    public void aprenderMagia(String magia){

    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

}
