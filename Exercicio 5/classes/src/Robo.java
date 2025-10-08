public class Robo {

    private String modelo;
    private String estado; // Ex: Funcional, Danificado
    private boolean flutuante;

    public Robo(String modelo, String estado, boolean flutuante) {
        this.modelo = modelo;
        this.estado = estado;
        this.flutuante = flutuante;
    }

    public void Limpar() {
        if (this.estado.equals("Funcional")) {
            System.out.println("O robô " + this.modelo + " está realizando tarefas domésticas.");
        } else {
            System.out.println("O robô está danificado e incapaz de limpar.");
        }
    }

    public void Flutuar() {
        if (this.flutuante) {
            System.out.println("O robô está flutuando e patrulhando a área.");
        } else {
            System.out.println("Este modelo não possui capacidade de flutuação.");
        }
    }

    public void Cumprimentar(String nome) {
        System.out.println("O robô diz: 'Olá, " + nome + ". Que bom vê-lo.'");
    }
}