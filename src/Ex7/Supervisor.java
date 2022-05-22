package Ex7;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, int idade, Double salario, Double bonus) {
        super(nome, idade, salario, bonus);
    }

    public  void bonificacao(){
        this.setBonus(this.getBonus() + this.getSalario() + 5000.0d);
        System.out.println("Bonificação do funcionário " + this.getNome() + ": R$" + this.getBonus());
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", salário: R$" + salario + '}';
    }
}
