package Ex3;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;
    protected static int totalPersonagens = 0;

    public Personagem() {

    }

    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
    }

    public void lvlUp() {

    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public float getXp() {
        return xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public int getLevel() {
        return level;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
