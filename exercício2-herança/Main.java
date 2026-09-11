public class Main {
    public static void main(String[] args) {
        VideoAula video = new VideoAula("Orientação a Objetos", 45, "YouTube");
        Podcast podcast = new Podcast("Inovação e Tecnologia", 30, "Carlos Silva");

        video.exibirResumo();
        podcast.exibirResumo();

        video.reproduzirVideo();
        podcast.ouvirPodcast();
    }
}