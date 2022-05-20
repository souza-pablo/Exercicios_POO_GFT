package Ex7;

public class Vendedor extends Funcionario{
    public void bonificacao(Double salario){
        this.bonificacao(this.getSalario() + 3000.0d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario + ", bonificação=" + this.getBonus() +
                '}';
    }

    public Vendedor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public  void bonificacao(){
        this.setBonus(this.getSalario() + 3000.0d);
    }
}
