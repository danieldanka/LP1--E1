package tela.registrar.interfaceVideo;

public class videoFelca {

    private String titulo;
    private int duracao;
    private int vizualizacoes;

    public videoFelca(String titulo, int duracao, int vizualizacoes){
        this.titulo = titulo;
        this.duracao = duracao;
        this.vizualizacoes = vizualizacoes;
    }

    public String getTitulo() { return titulo; }
    public int getDuracao() { return duracao; }
    public int getVizualizacoes() { return vizualizacoes; }

    public void reproduzir () { /* implementação */ }
    public void denunciarAlgoritmo () { /* implementação */ }
    public void exibirEstatisticas () { /* implementação */ }
}