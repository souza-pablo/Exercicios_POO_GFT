package Ex7;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, Double salario, Double bonus) {
        super(nome, idade, salario, bonus);
    }

    public  void bonificacao(){
        this.setBonus(this.getBonus() + this.getSalario() + 10000.0d);
        System.out.println("Bonificação do funcionário " + this.getNome() + ": R$" + this.getBonus());
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", salário: R$" + salario + '}';
    }

}

