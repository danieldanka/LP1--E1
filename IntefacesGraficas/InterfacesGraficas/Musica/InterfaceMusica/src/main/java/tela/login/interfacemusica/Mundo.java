package tela.login.interfacemusica;

public class Mundo {

    private String nome;
    private int nuvens;
    private String estacoes;

    public Mundo(String nome, int nuvens, String estacoes) {
        this.nome = nome;
        this.nuvens = nuvens;
        this.estacoes = estacoes;
    }

    public String getNome() { return nome; }
    public int getNuvens() { return nuvens; }
    public String getEstacoes() { return estacoes; }

    public void Girar() {
        System.out.println("O " + this.nome + " está girando em seu eixo.");
    }
    public void Esquentar() { /* implementação */ }
    public void Esfriar() { /* implementação */ }
}