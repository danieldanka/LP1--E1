public class Show {

    private String cantor;
    private String local;
    private int publico;

    public Show(String cantor, String local, int publico) {
        this.cantor = cantor;
        this.local = local;
        this.publico = publico;
    }

    public void Lotacao() {
        System.out.println("O show de " + this.cantor + " atingiu a lotação máxima de " + this.publico + " pessoas!");
    }

    public void Cancelado() {
        System.out.println("O show de " + this.cantor + " foi cancelado.");
    }

    public void Adiado() {
        System.out.println("O show de " + this.cantor + " foi adiado para uma nova data.");
    }
}