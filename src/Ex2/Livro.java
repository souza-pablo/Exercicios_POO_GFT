package Ex2;

public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {

    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (this.getTema() == "educativo") {
            System.out.println("Livro educativo não tem imposto: " + this.getNome());
        } else {
            imposto = this.getPreco() / 10;
            System.out.println("R$ " + imposto + " de impostos sobre o livro " + this.getNome());
        }
        return 0;
    }
}
