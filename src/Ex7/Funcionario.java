package Ex7;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected Double salario;
    protected Double bonus;

    public void bonificacao() {
        this.setBonus(this.getBonus() + this.getSalario());
        System.out.println("Bonificação do funcionário " + this.getNome() + ": R$" + this.getBonus());
    }

    public Funcionario(String nome, int idade, Double salario, Double bonus) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", salario: R$" + salario + '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
