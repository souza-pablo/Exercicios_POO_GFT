package Ex2;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {

    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }


    public void listaLivros() {
        System.out.println();
        if (livros == null || livros.size() == 0) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A loja Americanas possui estes livros para venda:");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("Título: " + livros.get(i).getNome() + ", preço: " + livros.get(i).getPreco() + ", quantidade: " + livros.get(i).getQtd() + " em estoque.");
            }
        }
        System.out.println();
    }

    public void listaVideoGames() {
        if (videoGames == null || videoGames.size() == 0) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A loja Americanas possui estes video-games para venda:");
            for (int i = 0; i < videoGames.size(); i++) {
                System.out.println("Título: " + videoGames.get(i).getNome() + ", preço: " + videoGames.get(i).getPreco() + ", quantidade: " + videoGames.get(i).getQtd() + " em estoque.");
            }
        }
        System.out.println();
    }

    public double calculaPatrimonio() {


        System.out.println("O patrimõnio da loja: " + this.getNome() + " é de " + "R$ " );
        return 0d;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
}

