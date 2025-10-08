public class Cachorro {

    private String nome;
    private String raca;
    private int lealdade;

    public Cachorro(String nome, String raca, int lealdade) {
        this.nome = nome;
        this.raca = raca;
        this.lealdade = lealdade;
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getLealdade() { return lealdade; }

    public void Explorar() {
        System.out.println(this.nome + " está farejando as ruínas próximas.");
    }

    public void Esperar() {
        System.out.println(this.nome + " está sentado e aguardando um comando do dono.");
    }

    public void Seguir(String dono) {
        System.out.println(this.nome + " (Lealdade: " + this.lealdade + ") está seguindo " + dono + " de perto.");
    }
}