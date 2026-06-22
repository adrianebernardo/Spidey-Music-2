public class Musica extends AudioItem {
    private String artista;

    public Musica(String titulo, String artista, double duracao) {
        super(titulo, duracao);
        this.artista = artista;
    }

    @Override
    public void tocar() {
        registrarReproducao();
        System.out.println("\n▶️ Tocando: " + this.getTitulo() + " - " + this.artista);
        System.out.println("(🎵 Imagine uma música foda......... tocando... 🎵)");
    }

    @Override
    public String getRotuloExibicao() {
        return this.getTitulo() + " - " + this.artista;
    }

    public String getArtista() { return artista; }

    public boolean isSpiderMan() {
        return this.getTitulo().equalsIgnoreCase("Sunflower") ||
                this.getTitulo().equalsIgnoreCase("Abertura O Espetacular Homem-Aranha") ||
                this.getTitulo().equalsIgnoreCase("Homem Aranha");
    }
}
