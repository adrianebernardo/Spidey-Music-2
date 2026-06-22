import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static List<AudioItem> bancoAudio;
    public static User userLogado;
    public static Playlist playlistUsuario;

    public static AudioItem[] historicoGeral = new AudioItem[5];
    public static int totalRepro = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        userLogado = new User("teste", "teste");
        playlistUsuario = new Playlist("Teia Pessoal de " + userLogado.getNome());
        bancoAudio = Data.carregarBanco();

        boolean logado = false;

        // --- FLUXO DE LOGIN ---
        while (!logado) {
            Decoracoes.exibirBannerLogin();
            String opcaoLogar = teclado.nextLine();

            switch (opcaoLogar) {
                case "1":
                    Decoracoes.promptUsuarioLogin();
                    String usuario = teclado.nextLine();
                    Decoracoes.promptEmailLogin();
                    String email = teclado.nextLine();

                    if (usuario.equals(userLogado.getNome()) && email.equals(userLogado.getEmail())) {
                        Decoracoes.msgProcurandoTeia();
                        Decoracoes.pausa(2500);
                        Decoracoes.msgUsuarioVerificado();
                        Decoracoes.msgFiosDeSeda();
                        Decoracoes.pausa(2500);
                        logado = true;
                    } else {
                        Decoracoes.msgLoginFalhou();
                        Decoracoes.pausa(2500);
                    }
                    break;

                case "2":
                    Decoracoes.promptNomeCadastro();
                    String novoNome = teclado.nextLine();
                    if (novoNome.isBlank()) { Decoracoes.msgNomeVazio(); break; }

                    String novoEmail = "";
                    boolean emailValido = false;
                    while (!emailValido) {
                        Decoracoes.promptEmailCadastro();
                        novoEmail = teclado.nextLine().trim();
                        if (novoEmail.contains("@") && novoEmail.length() >= 3) {
                            emailValido = true;
                        } else {
                            System.out.println("⚠️  E-mail inválido! O e-mail precisa conter um '@' e ser completo.");
                        }
                    }
                    userLogado = new User(novoNome, novoEmail);
                    Decoracoes.msgCadastroConcluido();
                    break;
                default:
                    Decoracoes.msgOpcaoLoginInvalida();
            }
        }

        // --- MENU PRINCIPAL ---
        boolean noMenuPrincipal = true;
        while (noMenuPrincipal) {
            Decoracoes.exibirMenuPrincipal();
            String opcaoMenu = teclado.nextLine();

            switch (opcaoMenu) {
                case "0" -> Decoracoes.msgVoltandoMenu();
                case "1" -> filtrarETocar(teclado, Musica.class);
                case "2" -> filtrarETocar(teclado, Podcast.class);
                case "3" -> filtrarETocar(teclado, AudioBook.class);
                case "4" -> cadastrarNovoAudio(teclado);
                case "5" -> pesquisarPorTitulo(teclado);
                case "6" -> exibirHistorico();
                case "7" -> exibirRelatorioPodcasts(teclado);
                case "8" -> tocarDaPlaylist(teclado);
                case "9" -> { Decoracoes.msgSairApp(); noMenuPrincipal = false; }
                default -> Decoracoes.msgComandoInvalido();
            }
        }
    }

    // --- MÉTODO POLIMÓRFICO DE FILTRAGEM (Requisito Nível 3) ---
    private static void filtrarETocar(Scanner teclado, Class<? extends AudioItem> classe) {
        List<AudioItem> filtrados = bancoAudio.stream()
                .filter(classe::isInstance)
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum item deste tipo encontrado na teia!");
            return;
        }

        Decoracoes.exibirListaDupla(filtrados, Decoracoes.LARGURA_CAIXA);

        int escolha = lerInteiro(teclado);
        if (escolha > 0 && escolha <= filtrados.size()) {
            AudioItem escolhido = filtrados.get(escolha - 1);
            escolhido.tocar();
            adicionarAoHistorico(escolhido);
        } else {
            Decoracoes.msgPosicaoInvalida();
        }
    }

    // --- MÉTODOS DE SUPORTE (Mantidos conforme original) ---

    private static void cadastrarNovoAudio(Scanner teclado) {
        Decoracoes.exibirCabecalhoCadastro();
        String tipoEscolhido = teclado.nextLine();
        switch (tipoEscolhido) {
            case "1" -> cadastrarMusica(teclado);
            case "2" -> cadastrarPodcast(teclado);
            case "3" -> cadastrarAudiobook(teclado);
            default -> Decoracoes.msgTipoCadastroInvalido();
        }
    }

    private static void cadastrarMusica(Scanner teclado) {
        Decoracoes.exibirCabecalhoCadastroMusica();
        String titulo = lerTexto(teclado, Decoracoes::promptTituloMusica);
        String artista = lerTexto(teclado, Decoracoes::promptArtistaMusica);
        double duracao = lerDuracao(teclado);
        if (duracao <= 0) return;
        bancoAudio.add(new Musica(titulo, artista, duracao));
        Decoracoes.msgMusicaCadastrada();
    }

    private static void cadastrarPodcast(Scanner teclado) {
        Decoracoes.exibirCabecalhoCadastroPodcast();
        String titulo = lerTexto(teclado, Decoracoes::promptTituloPodcast);
        String apresentador = lerTexto(teclado, Decoracoes::promptApresentadorPodcast);
        Decoracoes.promptEpisodioPodcast();
        int episodio = lerInteiro(teclado);
        if (episodio <= 0) return;
        double duracao = lerDuracao(teclado);
        if (duracao <= 0) return;
        bancoAudio.add(new Podcast(titulo, apresentador, episodio, duracao));
        Decoracoes.msgPodcastCadastrado();
    }

    private static void cadastrarAudiobook(Scanner teclado) {
        Decoracoes.exibirCabecalhoCadastroAudiobook();
        String titulo = lerTexto(teclado, Decoracoes::promptTituloAudiobook);
        String autor = lerTexto(teclado, Decoracoes::promptAutorAudiobook);
        Decoracoes.promptCapituloAudiobook();
        int capitulo = lerInteiro(teclado);
        if (capitulo <= 0) return;
        double duracao = lerDuracao(teclado);
        if (duracao <= 0) return;
        bancoAudio.add(new AudioBook(titulo, autor, capitulo, duracao));
        Decoracoes.msgAudiobookCadastrado();
    }

    private static void pesquisarPorTitulo(Scanner teclado) {
        Decoracoes.exibirCabecalhoPesquisa();
        String tituloBuscado = teclado.nextLine();
        if (tituloBuscado.isBlank()) { Decoracoes.msgTituloPesquisaVazio(); return; }
        if (Decoracoes.tentarEasterEgg(tituloBuscado)) return;
        boolean encontrou = false;
        for (AudioItem item : bancoAudio) {
            if (item.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                Decoracoes.msgAudioEncontrado(item.getRotuloExibicao());
                encontrou = true;
                Decoracoes.exibirOpcoesPosBusca();
                int escolhaBusca = lerInteiro(teclado);
                if (escolhaBusca == 1) { item.tocar(); adicionarAoHistorico(item); }
                break;
            }
        }
        if (!encontrou) Decoracoes.msgAudioNaoEncontrado();
    }

    private static void exibirHistorico() {
        Decoracoes.exibirCabecalhoHistorico();
        boolean historicoVazio = true;
        for (int i = 0; i < 5; i++) {
            if (historicoGeral[i] != null) {
                historicoVazio = false;
                Decoracoes.exibirItemHistorico(i + 1, historicoGeral[i].getRotuloExibicao());
            }
        }
        if (historicoVazio) Decoracoes.msgHistoricoVazio();
    }

    private static void exibirRelatorioPodcasts(Scanner teclado) {
        Decoracoes.exibirCabecalhoRelatorioPodcasts();
        bancoAudio.stream()
                .filter(Podcast.class::isInstance)
                .map(Podcast.class::cast)
                .filter(pod -> pod.getDuracao() > 30.0)
                .filter(pod -> pod.getRepro() > 50)
                .sorted((a, b) -> Integer.compare(b.getLikes(), a.getLikes()))
                .forEach(Decoracoes::exibirLinhaRelatorioPodcast);
        Decoracoes.promptEnterContinuar();
        teclado.nextLine();
    }

    private static void tocarDaPlaylist(Scanner teclado) {
        Decoracoes.exibirCabecalhoPlaylist();
        Decoracoes.exibirInfoPlaylist(playlistUsuario.getTitulo());
        List<AudioItem> itensDaPlaylist = playlistUsuario.getItens();
        if (itensDaPlaylist.isEmpty()) { Decoracoes.msgPlaylistVazia(); teclado.nextLine(); }
        else {
            Decoracoes.exibirListaDupla(itensDaPlaylist, Decoracoes.LARGURA_CAIXA);
            Decoracoes.exibirLinhaLonga();
            Decoracoes.promptEscolherAudioPlaylist(itensDaPlaylist.size());
            int escolhaPlay = lerInteiro(teclado);
            int indicePlay = escolhaPlay - 1;
            if (indicePlay >= 0 && indicePlay < itensDaPlaylist.size()) {
                AudioItem itemSelecionado = itensDaPlaylist.get(indicePlay);
                adicionarAoHistorico(itemSelecionado);
                itemSelecionado.tocar();
                Decoracoes.pausa(2000);
            } else Decoracoes.msgNumeroPlaylistInvalido();
        }
    }

    public static void adicionarAoHistorico(AudioItem item) {
        if (totalRepro < 5) {
            historicoGeral[totalRepro] = item;
            totalRepro++;
        } else {
            for (int i = 0; i < 4; i++) historicoGeral[i] = historicoGeral[i + 1];
            historicoGeral[4] = item;
        }
    }

    private static int lerInteiro(Scanner teclado) {
        try { return Integer.parseInt(teclado.nextLine().trim()); }
        catch (NumberFormatException e) { return -1; }
    }

    private static String lerTexto(Scanner teclado, Runnable prompt) {
        prompt.run();
        return teclado.nextLine().trim();
    }

    private static double lerDuracao(Scanner teclado) {
        Decoracoes.promptDuracao();
        try {
            double duracao = Double.parseDouble(teclado.nextLine().trim());
            if (duracao <= 0 || duracao > 60) { Decoracoes.msgDuracaoInvalida(); return -1; }
            return duracao;
        } catch (NumberFormatException e) { Decoracoes.msgDuracaoFormatoInvalido(); return -1; }
    }
}