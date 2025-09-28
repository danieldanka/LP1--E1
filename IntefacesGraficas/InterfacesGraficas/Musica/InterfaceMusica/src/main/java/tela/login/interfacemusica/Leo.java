package tela.login.interfacemusica;

public class Leo {

    private String nome;
    private int altura;
    private int aniversario;

    public Leo(String nome, int altura, int aniversario) {
        this.nome = nome;
        this.altura = altura;
        this.aniversario = aniversario;
    }

    public String getNome() { return nome; }
    public int getAltura() { return altura; }
    public int getAniversario() { return aniversario; }

    public void Cantar() {
        System.out.println(this.nome + " está cantando.");
    }
    public void Andar() { /* implementação */ }
    public void Pensar() { /* implementação */ }
}