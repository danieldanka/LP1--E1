public class Pessoa {

    private String nome;
    private int altura;
    private String profissao;

    public Pessoa(String nome, int altura, String profissao) {
        this.nome = nome;
        this.altura = altura;
        this.profissao = profissao;
    }

    public void Cantar() {
        System.out.println(this.nome + " está cantando.");
    }

    public void Andar() {
        System.out.println(this.nome + " está andando.");
    }

    public void Dormir() {
        System.out.println(this.nome + " está dormindo.");
    }
}