public class Influenciador {


    private String nome;
    private boolean investigado;
    private int seguidores;


    public Influenciador(String nome, boolean investigado, int seguidores) {
        this.nome = nome;
        this.investigado = investigado;
        this.seguidores = seguidores;
    }


    public void ExporCaso() {
        System.out.println("O influenciador " + this.nome + " está expondo um caso.");
    }

    public void VerificarInvestigacao() {
        if (this.investigado) {
            System.out.println("O influenciador " + this.nome + " está sob investigação.");
        } else {
            System.out.println("O influenciador " + this.nome + " não está sob investigação.");
        }
    }

    public void NotificarPlataforma() {
        System.out.println("O influenciador " + this.nome + " notificou a plataforma.");
    }

}
