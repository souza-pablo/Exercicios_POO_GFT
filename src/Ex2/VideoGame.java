package Ex2;

public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {

    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (this.isUsado()) {
            imposto = this.getPreco() / 4;
            System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " usado"+ ", R$ " + imposto);
        } else {
            imposto = (this.getPreco() * 0.45);
            System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " R$ " + imposto);
        }
        return 0;
    }
}
