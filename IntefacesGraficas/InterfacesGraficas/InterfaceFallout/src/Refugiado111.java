public class Refugiado111 {

    private String nome;
    private String genero;
    private String estadoSobrevivencia;

    public Refugiado111(String nome, String genero, String estadoSobrevivencia) {
        this.nome = nome;
        this.genero = genero;
        this.estadoSobrevivencia = estadoSobrevivencia;
    }

    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public String getEstadoSobrevivencia() { return estadoSobrevivencia; }

    public void SairDoRefugio() {
        System.out.println(this.nome + " está deixando a segurança do Refúgio 111.");
        this.estadoSobrevivencia = "Explorando";
    }

    public void ExplorarRuinas() {
        System.out.println(this.nome + " (" + this.genero + ") está vasculhando as ruínas em busca de suprimentos.");
    }

    public void Interagir(String entidade) {
        System.out.println(this.nome + " está interagindo com o(a) " + entidade + ".");
    }
}