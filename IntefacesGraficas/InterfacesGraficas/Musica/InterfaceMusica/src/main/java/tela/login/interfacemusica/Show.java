package tela.login.interfacemusica;

public class Show {

    private String cantor;
    private String local;
    private int publico;

    public Show(String cantor, String local, int publico) {
        this.cantor = cantor;
        this.local = local;
        this.publico = publico;
    }

    public String getCantor() { return cantor; }
    public String getLocal() { return local; }
    public int getPublico() { return publico; }

    public void Lotacao() {
        System.out.println("O show de " + this.cantor + " atingiu a lotação máxima de " + this.publico + " pessoas!");
    }
    public void Cancelado() { /* implementação */ }
    public void Adiado() { /* implementação */ }
}