public class Leo {

    private String nome;
    private int altura;
    private int aniversario;

    public Leo(String nome, int altura, int aniversario) {
        this.nome = nome;
        this.altura = altura;
        this.aniversario = aniversario;
    }

    public void Cantar() {
        System.out.println(this.nome + " está cantando.");
    }

    public void Andar() {
        System.out.println(this.nome + " está andando.");
    }

    public void Pensar() {
        System.out.println(this.nome + " está pensando profundamente.");
    }
}
