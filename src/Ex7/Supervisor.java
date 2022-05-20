package Ex7;

public class Supervisor extends Funcionario{
    public void bonificacao(Double salario){
        this.bonificacao(this.getSalario() + 5000.0d);
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario + ", bonificação=" + this.getBonus() +
                '}';
    }

    public Supervisor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public  void bonificacao(){
        this.setBonus(this.getSalario() + 5000.0d);
    }
}
