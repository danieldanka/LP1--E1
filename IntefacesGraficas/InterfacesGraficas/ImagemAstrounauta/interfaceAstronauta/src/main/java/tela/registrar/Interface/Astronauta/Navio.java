package tela.registrar.Interface.Astronauta;

public class Navio {

    private String nome;
    private int altura;
    private int comprimento;

    public Navio(String nome, int altura, int comprimento) {
        this.nome = nome;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public String getNome() { return nome; }
    public int getAltura() { return altura; }
    public int getComprimento() { return comprimento; }

    public void Navegar() {
        System.out.println("O navio " + this.nome + " está navegando.");
    }

    public void Afundar() {
        System.out.println("O navio " + this.nome + " afundou!");
    }

    public void Atracar() {
        System.out.println("O navio " + this.nome + " atracou no porto.");
    }
}