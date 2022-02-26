package Classes;

public class Modulo {
    private String nome;
    private int numero;
    private int duracao;
    private int quantidadeXp;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getQuantidadeXp() {
        return quantidadeXp;
    }

    public void setQuantidadeXp(int quantidadeXp) {
        this.quantidadeXp = quantidadeXp;
    }

    public int retornaPontos(int numeroModulo) {
        int pontos = 0;
        if (numeroModulo == 1) {
            pontos = 1000;
        } else if (numeroModulo == 2) {
            pontos = 1050;
        } else if (numeroModulo == 3) {
            pontos = 2000;
        } else if (numeroModulo == 4) {
            pontos = 3050;
        } else {
            pontos = 4000;
        }
        return pontos;
    }
}
