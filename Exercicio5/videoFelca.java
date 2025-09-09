
public class videoFelca {


        private String titulo;
        private int duracao;
        private int vizualizacoes;


    public videoFelca(String titulo, int duracao, int vizualizacoes){
            this.titulo = titulo;
            this.duracao = duracao;
            this.vizualizacoes = vizualizacoes;

        }
        public void reproduzir () {
            System.out.println("O vídeo'" + this.titulo + "'está sendo reproduzido.");
        }

        public void denunciarAlgoritmo () {
            System.out.println("O vídeo'" + this.titulo + "'foi denunciado ao algoritmo.");
        }

        public void exibirEstatisticas () {
            System.out.println("Estatísticas do vídeo '" + this.titulo + "':");
            System.out.println("Duração:" + this.duracao + " minutos.");
            System.out.println("Vizualizações:" + this.vizualizacoes + " milhões.");
         }
    }

