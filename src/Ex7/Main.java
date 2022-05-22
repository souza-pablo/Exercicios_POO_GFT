package Ex7;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pablo", 19, 1600.40, 0.0d);
        Gerente gerente = new Gerente("Paulo", 51, 5400.70, 0.0d);
        Supervisor supervisor = new Supervisor("Francisca", 44, 2500.80, 0.0d);
        Vendedor vendedor = new Vendedor("Henrique", 32, 2000.10, 0.0d);

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);

        funcionario.bonificacao();
        funcionario.bonificacao();
        gerente.bonificacao();
        gerente.bonificacao();
        supervisor.bonificacao();
        supervisor.bonificacao();
        vendedor.bonificacao();
        vendedor.bonificacao();



    }
}
