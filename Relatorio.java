import java.util.List;
import java.util.Scanner;

public class Relatorio {

    public static void exibir(List<AudioItem> bancoAudio, Scanner teclado) {
        System.out.println("\n📊 [ RELATÓRIO GERAL ] 🕸️");
        System.out.println("Qual relatório deseja ver?");
        System.out.println("[ 1 ] 🎵 Músicas mais escutadas");
        System.out.println("[ 2 ] 🎙️ Podcasts mais escutados");
        System.out.println("[ 3 ] 📚 Audiobooks mais escutados");
        System.out.println("[ 4 ] 🔥 Podcasts populares (duração > 30min e repro > 50, por likes)");
        System.out.print("Escolha: ");

        String opcao = teclado.nextLine();

        switch (opcao) {
            case "1" -> exibirMusicas(bancoAudio);
            case "2" -> exibirPodcasts(bancoAudio);
            case "3" -> exibirAudiobooks(bancoAudio);
            case "4" -> exibirPodcastsPopulares(bancoAudio);
            default  -> System.out.println("⚠️ Opção inválida!");
        }

        System.out.println("\nPressione Enter para voltar...");
        teclado.nextLine();
    }

    private static void exibirMusicas(List<AudioItem> bancoAudio) {
        System.out.println("\n🎵 TOP MÚSICAS MAIS ESCUTADAS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(a -> a.getCategoria().equals("Musica"))
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(m -> System.out.printf(
                        "  🎶 %-35s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        m.getRotuloExibicao(),
                        m.getRepro(),
                        m.getLikes()
                ));
    }

    private static void exibirPodcasts(List<AudioItem> bancoAudio) {
        System.out.println("\n🎙️ TOP PODCASTS MAIS ESCUTADOS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(a -> a.getCategoria().equals("Podcast"))
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(p -> System.out.printf(
                        "  🎙️ %-35s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        p.getRotuloExibicao(),
                        p.getRepro(),
                        p.getLikes()
                ));
    }

    private static void exibirAudiobooks(List<AudioItem> bancoAudio) {
        System.out.println("\n📚 TOP AUDIOBOOKS MAIS ESCUTADOS 🕸️");
        System.out.println("─────────────────────────────────────────────────────");
        bancoAudio.stream()
                .filter(a -> a.getCategoria().equals("AudioBook"))
                .sorted((a, b) -> Integer.compare(b.getRepro(), a.getRepro()))
                .limit(5)
                .forEach(ab -> System.out.printf(
                        "  📚 %-35s | 🔊 %,6d plays | ❤️ %,5d likes%n",
                        ab.getRotuloExibicao(),
                        ab.getRepro(),
                        ab.getLikes()
                ));
    }

    private static void exibirPodcastsPopulares(List<AudioItem> bancoAudio) {
        Decoracoes.exibirCabecalhoRelatorioPodcasts();
        bancoAudio.stream()
                .filter(a -> a.getCategoria().equals("Podcast"))
                .map(a -> (Podcast) a)
                .filter(p -> p.getDuracao() > 30 && p.getRepro() > 50)
                .sorted((a, b) -> Integer.compare(b.getLikes(), a.getLikes()))
                .forEach(Decoracoes::exibirLinhaRelatorioPodcast);
    }
}