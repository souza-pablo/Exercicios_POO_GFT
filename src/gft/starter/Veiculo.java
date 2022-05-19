package gft.starter;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public void acelerar(){
        if (this.isLigado == true){
            this.setVelocidade(this.getVelocidade() + 20);
            System.out.println("Acelerando!!!");
        } else {
            System.out.println("Não é possível acelerar o carro desligado!");
        }
    }
    public void abastecer(int combustivel){
        if (this.litrosCombustivel <=60 && this.litrosCombustivel + combustivel<=60) {
            this.litrosCombustivel = this.litrosCombustivel + combustivel;
            System.out.println("Abastecendo!");
        }
        else {
            System.out.println("Não é possível abastecer esse valor, o tanque tem 60 litros!");
        }
    }
    public void frear(){
        if (this.getVelocidade() == 0) System.out.println("Não tem como frear, o veículo já está parado!");
        else {
            this.setVelocidade(this.getVelocidade() - 20);
            System.out.println("Freando!!!");
        }
    }
    public void pintar(String cor){
        this.cor = cor;
        System.out.println("Seu veículo agora tem a cor " + this.getCor());
    }
    public void ligar(){
        if (isLigado == true) System.out.println("O carro já está ligado!");
        else {
            this.isLigado = true;
            System.out.println("Carro ligado com sucesso!");
        }
    }
    public void desligar(){
        if (isLigado == false) System.out.println("O carro já está desligado!");
        else if (this.isLigado == true &&  this.getVelocidade() == 0){
            this.isLigado = false;
            System.out.println("Carro desligado com sucesso!");
        }
        else {
            System.out.println("É preciso parar o carro para desligar!");
        }
    }
    public void status(){
        System.out.println("Marca do Veículo: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Km " + this.getKm() + "km");
        System.out.println("Está ligado? " + this.isLigado);
        System.out.println("Quantidade de combustível " + this.getLitrosCombustivel());
        System.out.println("Velocidade " + this.getVelocidade());
        System.out.println("Preço " + this.getPreco() + "R$");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public float getKm() {
        return km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
