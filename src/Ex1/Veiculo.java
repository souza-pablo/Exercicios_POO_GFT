package Ex1;

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
        if (this.isLigado){
            this.setVelocidade(this.getVelocidade() + 20);
            System.out.println("Acelerando!!!");
        } else {
            System.out.println("Não é possível acelerar o carro desligado!");
        }
    }

    public void abastecer(int combustivel){
        if (this.litrosCombustivel <= 60 && this.litrosCombustivel + combustivel <= 60 && this.velocidade == 0) {
            this.litrosCombustivel = this.litrosCombustivel + combustivel;
            System.out.println("Abastecendo " + combustivel +" litros!");
        }
        else if (this.velocidade > 0){
            System.out.println("Não é possível abastecer com o carro em movimento!");
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
        if (this.getVelocidade() == 0){
            this.cor = cor;
            System.out.println("Pintando...");
            System.out.println("Seu veículo agora tem a cor " + this.getCor());
        } else {
            System.out.println("Não é possível pintar o veículo em movimento!");
        }
    }

    public void ligar(){
        if (isLigado) System.out.println("O carro já está ligado!");
        else {
            this.isLigado = true;
            System.out.println("Carro ligado com sucesso!");
        }
    }

    public void desligar(){
        if (!isLigado) System.out.println("O carro já está desligado!");
        else if (this.getVelocidade() == 0){
            this.isLigado = false;
            System.out.println("Carro desligado com sucesso!");
        }
        else {
            System.out.println("É preciso parar o carro para desligar!");
        }
    }

    @Override
    public String toString() {
        String ligado;
        if (isLigado){
            ligado = "sim";
        } else {
            ligado = "não";
        }
        return "Veiculo{" +
                "marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", placa: '" + placa + '\'' +
                ", cor: '" + cor + '\'' +
                ", quilômetros rodados: " + km + "km" +
                ", está ligado? " + ligado +
                ", quantidade de combustível: " + litrosCombustivel + " litros" +
                ", velocidade: " + velocidade + "km/h" +
                ", preço: R$" + preco +
                '}';
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
