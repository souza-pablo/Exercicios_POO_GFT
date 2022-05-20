package Ex7;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 51, 5400.70,0.0d);
        Supervisor supervisor = new Supervisor("Francisca", 44, 2500.80,0.0d);
        Vendedor vendedor = new Vendedor("Henrique", 32, 2000.10,0.0d);

        gerente.bonificacao();
        gerente.bonificacao();
        supervisor.bonificacao();
        vendedor.bonificacao();
        vendedor.bonificacao();

        System.out.println(gerente.toString());
        System.out.println(supervisor.toString());
        System.out.println(vendedor.toString());


    }
}
