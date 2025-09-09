public class Astronauta {

    private String nome;
    private int altura;
    private String aniversario;

    public Astronauta(String nome, int altura, String aniversario) {
        this.nome = nome;
        this.altura = altura;
        this.aniversario = aniversario;
    }

    public void Explorar() {
        System.out.println(this.nome + " está explorando o espaço.");
    }

    public void Reparar() {
        System.out.println(this.nome + " está fazendo um reparo.");
    }

    public void Comunicar() {
        System.out.println(this.nome + " está se comunicando com a base.");
    }
}
