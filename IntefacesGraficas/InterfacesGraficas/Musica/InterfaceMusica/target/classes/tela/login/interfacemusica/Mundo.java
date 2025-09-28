package aluno;

public class Mundo {

    private String nome;
    private int nuvens;
    private String estacoes;

    public Mundo(String nome, int nuvens, String estacoes) {
        this.nome = nome;
        this.nuvens = nuvens;
        this.estacoes = estacoes;
    }

    public void Girar() {
        System.out.println("O " + this.nome + " está girando em seu eixo.");
    }

    public void Esquentar() {
        System.out.println("O " + this.nome + " está esquentando, o que muda a temperatura em " + this.estacoes + ".");
    }

    public void Esfriar() {
        System.out.println("O " + this.nome + " está esfriando, o que altera o clima do mundo.");
    }
}
