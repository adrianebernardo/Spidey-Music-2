import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Relatorio {

    public static void exibir(List<AudioItem> bancoAudio, Scanner teclado) {
        System.out.println("\n📊 [ RELATÓRIO GERAL ] 🕸️");
        System.out.println("Qual relatório deseja ver?");
        System.out.println("[ 1 ] 🎵 Músicas mais escutadas");
        System.out.println("[ 2 ] 🎙️ Podcasts mais escutados");
        System.out.println("[ 3 ] 📚 Audiobooks mais escutados");
        System.out.print("Escolha: ");

        String opcao = teclado.nextLine();

        switch (opcao) {
            case "1" -> exibirMusicas(bancoAudio);
            case "2" -> exibirPodcasts(bancoAudio);
            case "3" -> exibirAudiobooks(bancoAudio);
            default  -> System.out.println("⚠️ Opção inválida!");
        }

        System.out.println("\nPressione Enter para voltar...");
        teclado.nextLine();
    }

    private static void exibirMusicas(List<AudioItem> bancoAudio) {
        System.out.println("\n🎵 TOP MÚSICAS MAIS ESCUTADAS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(Musica.class::isInstance)
                .map(Musica.class::cast)
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(m -> System.out.printf(
                        "  🎶 %-35s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        m.getTitulo() + " - " + m.getArtista(),
                        m.getRepro(),
                        m.getLikes()
                ));
    }

    private static void exibirPodcasts(List<AudioItem> bancoAudio) {
        System.out.println("\n🎙️ TOP PODCASTS MAIS ESCUTADOS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(Podcast.class::isInstance)
                .map(Podcast.class::cast)
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(p -> System.out.printf(
                        "  🎙️ Ep.%-3d | %-25s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        p.getNumeroEpisodio(),
                        p.getTitulo() + " - " + p.getApresentador(),
                        p.getRepro(),
                        p.getLikes()
                ));
    }

    private static void exibirAudiobooks(List<AudioItem> bancoAudio) {
        System.out.println("\n📚 TOP AUDIOBOOKS MAIS ESCUTADOS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(AudioBook.class::isInstance)
                .map(AudioBook.class::cast)
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(ab -> System.out.printf(
                        "  📚 Cap.%-3d | %-25s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        ab.getCapitulo(),
                        ab.getTitulo() + " - " + ab.getAutor(),
                        ab.getRepro(),
                        ab.getLikes()
                ));
    }
}