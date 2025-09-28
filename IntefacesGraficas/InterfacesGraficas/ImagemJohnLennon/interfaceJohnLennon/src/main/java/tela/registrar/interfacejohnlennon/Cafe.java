package tela.registrar.interfacejohnlennon;

public class Cafe {

    private String grao;
    private String torra;
    private int temperatura;

    public Cafe(String grao, String torra, int temperatura) {
        this.grao = grao;
        this.torra = torra;
        this.temperatura = temperatura;
    }

    public String getGrao() { return grao; }
    public String getTorra() { return torra; }
    public int getTemperatura() { return temperatura; }

    public void Queimar() {
        System.out.println("O café foi queimado.");
    }

    public void Esfriar() {
        System.out.println("O café está esfriando.");
    }

    public void Hidratar() {
        System.out.println("O café está hidratando.");
    }
}