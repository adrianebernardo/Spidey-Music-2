import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String titulo;
    private List<AudioItem> itens;

    public Playlist(String titulo) {
        this.titulo = titulo;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(AudioItem item) {
        this.itens.add(item);
    }

    public String getTitulo() { return titulo; }
    public List<AudioItem> getItens() { return itens; }

    @Override
    public String toString() {
        return "Playlist: " + this.titulo + " | Itens: " + this.itens.size();
    }
}