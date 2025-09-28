package tela.registrar.interfacejohnlennon;

public class Xicara {

    private String cor;
    private String material;
    private String produtor;

    public Xicara(String cor, String material, String produtor) {
        this.cor = cor;
        this.material = material;
        this.produtor = produtor;
    }

    public String getCor() { return cor; }
    public String getMaterial() { return material; }
    public String getProdutor() { return produtor; }

    public void Quebrar() {
        System.out.println("A xícara de " + this.material + " quebrou!");
    }

    public void Esvaziar() {
        System.out.println("A xícara de cor " + this.cor + " foi esvaziada.");
    }

    public void Encher() {
        System.out.println("A xícara de cor " + this.cor + " foi enchida.");
    }
}