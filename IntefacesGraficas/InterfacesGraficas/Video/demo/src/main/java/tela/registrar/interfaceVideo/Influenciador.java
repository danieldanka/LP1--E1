package tela.registrar.interfaceVideo;

public class Influenciador {

    private String nome;
    private boolean investigado;
    private int seguidores;

    public Influenciador(String nome, boolean investigado, int seguidores) {
        this.nome = nome;
        this.investigado = investigado;
        this.seguidores = seguidores;
    }

    public String getNome() { return nome; }
    public boolean isInvestigado() { return investigado; }
    public int getSeguidores() { return seguidores; }

    public void ExporCaso() { /* implementação */ }
    public void VerificarInvestigacao() { /* implementação */ }
    public void NotificarPlataforma() { /* implementação */ }
}