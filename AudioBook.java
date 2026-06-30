public class AudioBook extends AudioItem {
    private String autor;
    private int capitulo;

    public AudioBook(String titulo, String autor, int capitulo, double duracao) {
        super(titulo, duracao);
        this.autor = autor;
        this.capitulo = capitulo;
    }

    @Override
    public void tocar() {
        registrarReproducao();
        System.out.println("\n📚 Narrando Audiobook: " + this.getTitulo());
        System.out.println("   Autor: " + this.autor + " | Capítulo: " + this.capitulo);
        System.out.println("(📖 Imagine uma voz grave narrando capítulo por capítulo... 📖)");
    }

    @Override
    public String getRotuloExibicao() {
        return "Cap." + this.capitulo + " - " + this.getTitulo() + " (" + this.autor + ")";
    }

    @Override
    public String getCategoria() {
        return "AudioBook";
    }

    public String getAutor() { return autor; }
    public int getCapitulo() { return capitulo; }
}