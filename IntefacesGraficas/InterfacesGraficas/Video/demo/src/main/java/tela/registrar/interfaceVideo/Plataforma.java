package tela.registrar.interfaceVideo;

public class Plataforma {

    private String nome;
    private boolean moderacaoEficiente;
    private int qtdUsuarios;

    public Plataforma(String nome, boolean moderacaoEficiente, int qtdUsuarios) {
        this.nome = nome;
        this.moderacaoEficiente = moderacaoEficiente;
        this.qtdUsuarios = qtdUsuarios;
    }

    public String getNome() { return nome; }
    public boolean isModeracaoEficiente() { return moderacaoEficiente; }
    public int getQtdUsuarios() { return qtdUsuarios; }

    public void SinalizarQuebraNorma() { /* implementação */ }
    public void AnalisarAlgoritmo() { /* implementação */ }
    public void ImplementarModeracao() { /* implementação */ }
}