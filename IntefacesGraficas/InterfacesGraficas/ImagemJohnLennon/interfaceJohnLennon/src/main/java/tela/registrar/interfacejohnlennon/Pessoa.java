package tela.registrar.interfacejohnlennon;

public class Pessoa {

    private String nome;
    private int altura;
    private String profissao;

    public Pessoa(String nome, int altura, String profissao) {
        this.nome = nome;
        this.altura = altura;
        this.profissao = profissao;
    }


    public String Cantar() {
        return this.nome + " está cantando.";
    }

    public String Andar() {
        return this.nome + " está andando.";
    }

    public String Dormir() {
        return this.nome + " está dormindo.";
    }


    public String getNome() { return nome; }
    public String getProfissao() { return profissao; }
}
