package Ex7;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected Double salario;
    protected Double bonus;

    public  void bonificacao(){
        this.setBonus(this.getSalario());
    }

    public Funcionario(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario + ", bonificação=" + this.getBonus() +
                '}';
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