package Ex7;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, Double salario, Double bonus) {
        super(nome, idade, salario, bonus);
    }

    public  void bonificacao(){
        this.setBonus(this.getBonus() + this.getSalario() + 3000.0d);
        System.out.println("Bonificação do funcionário " + this.getNome() + ": R$" + this.getBonus());
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", salário: R$" + salario + '}';
    }
}
