package aluno;

public class Plataforma {

    private String nome;
    private boolean moderacaoEficiente;
    private int qtdUsuarios;


    public Plataforma(String nome, boolean moderacaoEficiente, int qtdUsuarios) {
        this.nome = nome;
        this.moderacaoEficiente = moderacaoEficiente;
        this.qtdUsuarios = qtdUsuarios;
    }

    public void SinalizarQuebraNorma() {
        System.out.println("Uma violação foi sinalizada na plataforma " + this.nome + ".");
    }

    public void AnalisarAlgoritmo() {
        System.out.println("O algoritmo da plataforma " + this.nome + " está sendo analisado.");
    }

    public void ImplementarModeracao() {
        System.out.println("A plataforma " + this.nome + " está implementando novas regras de moderação.");
    }

}
