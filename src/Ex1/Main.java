package Ex1;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setCor("azul");
        veiculo.setMarca("BMW");
        veiculo.setModelo("X6");
        veiculo.setPlaca("FDV3487");
        veiculo.setKm(0.0f);
        veiculo.setLigado(false);
        veiculo.setPreco(750000.00d);
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.pintar("vermelha");
        veiculo.desligar();
        veiculo.abastecer(50);
        veiculo.abastecer(10);
        veiculo.status();
    }
}
