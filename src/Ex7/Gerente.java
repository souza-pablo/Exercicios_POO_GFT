package Ex7;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, Double salario, Double bonus) {
        super(nome, idade, salario, bonus);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario + ", bonificação=" + this.getBonus() +
                '}';
    }

    public  void bonificacao(){
        this.setBonus(this.getBonus() + this.getSalario() + 10000.0d);
    }

}

