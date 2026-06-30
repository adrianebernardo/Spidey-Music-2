public class Podcast extends AudioItem {
    private String apresentador;
    private int numeroEpisodio;

    public Podcast(String titulo, String apresentador, int numeroEpisodio, double duracao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void tocar() {
        registrarReproducao();
        System.out.println("\n🎙️ Reproduzindo Podcast: " + this.getTitulo());
        System.out.println("   Apresentador: " + this.apresentador + " | Episódio: " + this.numeroEpisodio);
        System.out.println("(🕷️ As aranhas estão ouvindo o episódio com atenção... 🕷️)");
    }

    @Override
    public String getRotuloExibicao() {
        return "🎙️ Ep." + this.numeroEpisodio + " - " + this.getTitulo() + " (" + this.apresentador + ")";
    }

    @Override
    public String getCategoria() {
        return "Podcast";
    }

    public String getApresentador() { return apresentador; }
    public int getNumeroEpisodio() { return numeroEpisodio; }
}