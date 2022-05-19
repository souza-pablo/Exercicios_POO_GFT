package gft.starter;

public class Ex7 {
    public static void main(String[] args) {

    }

    protected static class Funcionario {
        String nome;
        int idade;
        double salario;

        protected double bonificacao() {
            return salario;
        }
    }

    protected class Gerente extends Funcionario {
        protected double bonificacao() {
            return salario + 10000.0f;
        }

        protected class Supervisor extends Funcionario {
            protected double bonificacao() {
                return salario + 5000.0f;
            }

            protected class Vendedor extends Funcionario {
                protected double bonificacao() {
                    return salario + 3000.0f;
                }
            }
        }
    }
}
