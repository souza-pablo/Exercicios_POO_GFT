package Ex7;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, Double salario) {
        super(nome, idade, salario);
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
        this.setBonus(this.getSalario() + 10000.0d);
    }

}

