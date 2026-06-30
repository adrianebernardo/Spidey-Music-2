public abstract class AudioItem {
    private String titulo;
    private double duracao;
    private int likes;
    private int repro;

    public AudioItem(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.likes = 0;
        this.repro = 0;
    }

    public abstract void tocar();

    public abstract String getRotuloExibicao();

    public abstract String getCategoria();

    public void likar() {
        this.likes++;
        System.out.println("Você deu like em: " + this.titulo);
    }

    public void inicializarDados(int repro, int likes) {
        this.repro = repro;
        this.likes = likes;
    }

    protected void registrarReproducao() {
        this.repro++;
    }

    public String getTitulo() { return titulo; }
    public double getDuracao() { return duracao; }
    public int getLikes() { return likes; }
    public int getRepro() { return repro; }

    @Override
    public String toString() {
        return getRotuloExibicao() + " | Duração: " + duracao +
                " min | Repro: " + repro + " | Likes: " + likes;
    }
}