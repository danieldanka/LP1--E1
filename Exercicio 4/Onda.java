public class Onda {

    private int comprimento;
    private int largura;
    private int velocidade;

    public Onda(int comprimento, int largura, int velocidade) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.velocidade = velocidade;
    }

    public void Avancar() {
        System.out.println("A onda está avançando.");
    }

    public void Dissipar() {
        System.out.println("A onda está se dissipando na costa.");
    }

    public void Afundar() {
        System.out.println("A onda está afundando a embarcação.");
    }
}