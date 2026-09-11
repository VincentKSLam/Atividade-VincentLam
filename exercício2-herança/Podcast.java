
public class Podcast extends Conteudo {
    public String apresentador;

    public Podcast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }

    public void ouvirPodcast() {
        System.out.println("Ouvindo podcast apresentado por " + apresentador + ".");
    }
}
