import java.util.List;

public class Decoracoes {

    public static final int LARGURA_CAIXA = 56;

    private static final String LINHA_LONGA =
            "*******************************************************************************************************************************";

    private static final String LINHA_MEDIA =
            "-------------------------------------------------------------------------------------------------------------------------------";

    // ── Login ──────────────────────────────────────────────────────────────

    public static void exibirBannerLogin() {
        System.out.println("""
                ***************************************************************************************
                
                    ____        _     _                  __  __           _         
                   / ___| _ __ (_) __| | ___ _   _      |  \\/  |_   _ ___(_) ___ ___
                   \\___ \\| '_ \\| |/ _` |/ _ \\ | | |     | |\\/| | | | / __| |/ __/ __|
                    ___) | |_) | | (_| |  __/ |_| |     | |  | | |_| \\__ \\ | (__\\__ \\
                   |____/| .__/|_|\\__,_|\\___|\\__, |     |_|  |_|\\__,_|___/_|\\___|___/
                         |_|                 |___/                                  
                
                
                      / _ \\
                    \\_\\(_)/_/
                     _//"\\\\_  Cadastre-se ou logue antes de entrar
                      /   \\
                
                
                 1 - Logar
                 2 - Cadastrar-se
                
                
                ************************************************************************************* """);
    }

    public static void promptUsuarioLogin() {
        System.out.print("Digite seu usuário: ");
    }

    public static void promptEmailLogin() {
        System.out.print("Digite seu e-mail: ");
    }

    public static void msgProcurandoTeia() {
        System.out.println("Nossas aranhas estão procurando pela sua teia no emaranhado. . . .");
    }

    public static void msgUsuarioVerificado() {
        System.out.println("Usuário verificado!");
    }

    public static void msgFiosDeSeda() {
        System.out.println("Seus fios de seda de belas músicas o espera...");
    }

    public static void msgLoginFalhou() {
        System.out.println("Usuário e/ou e-mail não encontrado, se não tiver uma conta clique em cadastrar-se.");
        System.out.println("Nossas aranhas ficarão felizes em tecer uma conta para você");
    }

    public static void promptNomeCadastro() {
        System.out.println("Digite o nome de usuario");
    }

    public static void msgNomeVazio() {
        System.out.println("⚠️ Nome de usuário não pode ser vazio!");
    }

    public static void promptEmailCadastro() {
        System.out.println("Digite o seu email:");
    }

    public static void msgEmailInvalido() {
        System.out.println("⚠️ E-mail inválido! As aranhas exigem um @ no fio do e-mail.");
    }

    public static void msgCadastroTecendo() {
        System.out.println("Nossas aranhas estão tecendo seu cadastro na nossa teia de usuários");
    }

    public static void msgCadastroConcluido() {
        System.out.println("Agora você já pode usar a opção 1 para Logar.");
    }

    public static void msgOpcaoLoginInvalida() {
        System.out.println("Opção inválida! Escolha 1 para Logar ou 2 para Cadastrar.");
    }

    // ── Menu principal ─────────────────────────────────────────────────────

    public static void exibirMenuPrincipal() {
        System.out.println("""
        **************************************************
        🕸️ MENU PRINCIPAL - SPIDEY MUSICS 🕸️
        
        [ 1 ] 🎶 Tocar Músicas
        [ 2 ] 🎙️ Tocar Podcasts
        [ 3 ] 📖 Tocar Audiobooks
        [ 4 ] 📝 Cadastrar Novo Item
        [ 5 ] 📊 Relatório de Podcasts
        [ 6 ] 🎵 Minha Playlist
        [ 7 ] 🚪 Sair
        **************************************************
        Escolha uma opção: """);
    }

    public static void msgVoltandoMenu() {
        System.out.println("\n↩️ Voltando ao menu principal...");
    }

    public static void msgComandoInvalido() {
        System.out.println("\n⚠️ Comando inválido!");
    }

    public static void msgSairApp() {
        System.out.println("\n🕷️ Nossas aranhas estão infinitamente tristes com você...");
        pausa(1500);
        System.out.println("Fique sabendo você que elas guardam rancor... Muito rancor 🔪🩸");
        pausa(1500);
        System.out.println("🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸🕷️🔪🩸");
    }

    // ── Teia geral ─────────────────────────────────────────────────────────

    public static void exibirCabecalhoTeiaGeral() {
        System.out.println("\n" + LINHA_LONGA);
        System.out.println("                                            🕸️  SUA TEIA DE ÁUDIOS DISPONÍVEIS 🕸️");
        System.out.println(LINHA_LONGA);
    }

    public static void exibirLinhaLonga() {
        System.out.println(LINHA_LONGA);
    }

    public static void promptEscolherAudio(int total) {
        System.out.println("Digite o número do áudio que você quer ouvir (de 1 a " + total + "):");
    }

    public static void msgPosicaoInvalida() {
        System.out.println("⚠️ Posição inválida na teia!");
    }

    public static void exibirPromptLike() {
        System.out.println("\nGostaria de dar um like para este áudio?");
        System.out.println("[1] Sim (Aranhas Felizes)");
        System.out.println("[2] Não (Aranhas Chateadas)");
    }

    public static void msgLikeAgradecido() {
        System.out.println("As aranhas agradecem por apreciar o trabalho delas");
    }

    public static void msgLikeRecusado() {
        System.out.println("As aranhas sussurram entre elas como você não tem consideração...");
    }

    public static void exibirPromptPlaylist() {
        System.out.println("\n🕷️ Deseja tecer este áudio na sua playlist pessoal?");
        System.out.println("[1] Sim, adicionar");
        System.out.println("[2] Não, deixar de fora");
    }

    public static void msgAdicionadoPlaylist(String tituloPlaylist) {
        System.out.println("🕸️ Sucesso! Adicionado na playlist: " + tituloPlaylist);
    }

    // ── Cadastro ───────────────────────────────────────────────────────────

    public static void exibirCabecalhoCadastro() {
        System.out.println("\n📝 [ CADASTRO DE NOVOS ÁUDIOS ] 🕷️");
        System.out.println("Qual tipo de conteúdo deseja cadastrar?");
        System.out.println("[ 1 ] 🎵 Música");
        System.out.println("[ 2 ] 🎙️ Podcast");
        System.out.println("[ 3 ] 📚 Audiobook");
    }

    public static void msgTipoCadastroInvalido() {
        System.out.println("⚠️ Tipo inválido! Escolha 1, 2 ou 3.");
    }

    public static void exibirCabecalhoCadastroMusica() {
        System.out.println("\n--- CADASTRO DE MÚSICA ---");
    }

    public static void exibirCabecalhoCadastroPodcast() {
        System.out.println("\n--- CADASTRO DE PODCAST ---");
    }

    public static void exibirCabecalhoCadastroAudiobook() {
        System.out.println("\n--- CADASTRO DE AUDIOBOOK ---");
    }

    public static void msgMusicaCadastrada() {
        System.out.println("\n🕸️ Sucesso! Nova música tecida nos servidores com maestria.");
    }

    public static void msgPodcastCadastrado() {
        System.out.println("\n🕸️ Sucesso! Novo podcast adicionado à teia!");
    }

    public static void msgAudiobookCadastrado() {
        System.out.println("\n🕸️ Sucesso! Novo audiobook adicionado à teia!");
    }

    public static void promptTituloMusica() {
        System.out.println("Digite o Título da música:");
    }

    public static void promptArtistaMusica() {
        System.out.println("Digite o Artista da música:");
    }

    public static void promptTituloPodcast() {
        System.out.println("Digite o Título do podcast:");
    }

    public static void promptApresentadorPodcast() {
        System.out.println("Digite o Apresentador:");
    }

    public static void promptEpisodioPodcast() {
        System.out.println("Digite o número do Episódio:");
    }

    public static void promptTituloAudiobook() {
        System.out.println("Digite o Título do audiobook:");
    }

    public static void promptAutorAudiobook() {
        System.out.println("Digite o Autor:");
    }

    public static void promptCapituloAudiobook() {
        System.out.println("Digite o número do Capítulo:");
    }

    public static void promptDuracao() {
        System.out.println("Digite a Duração em minutos (ex: 3.45):");
    }

    public static void msgDuracaoInvalida() {
        System.out.println("⚠️ Duração inválida! Deve ser entre 0 e 60 minutos.");
    }

    public static void msgDuracaoFormatoInvalido() {
        System.out.println("⚠️ Duração inválida!");
    }

    // ── Pesquisa ───────────────────────────────────────────────────────────

    public static void exibirCabecalhoPesquisa() {
        System.out.println("\n🔍 [ PESQUISAR POR TÍTULO ESPECÍFICO ] 🕸️");
        System.out.println("Digite o nome do áudio que as aranhas devem procurar:");
    }

    public static void msgTituloPesquisaVazio() {
        System.out.println("⚠️ As aranhas precisam de um nome para procurar!");
    }

    public static void msgAudioEncontrado(String rotulo) {
        System.out.println("  🕸️  Áudio encontrado: [ " + rotulo + " ]");
    }

    public static void exibirOpcoesPosBusca() {
        System.out.println("\n [ 1 ] 🔊 Ouvir Áudio\n [ 2 ] ↩️ Voltar para o Menu Principal\nDigite sua opção:");
    }

    public static void msgAudioNaoEncontrado() {
        System.out.println("As aranhas não acharam nenhum áudio com esse título no emaranhado.");
    }

    public static boolean tentarEasterEgg(String tituloBuscado) {
        if (tituloBuscado.equalsIgnoreCase("dottinha")) {
            exibirEasterEggDottinha();
            return true;
        }
        if (tituloBuscado.equalsIgnoreCase("pinky")) {
            exibirEasterEggPinky();
            return true;
        }
        if (tituloBuscado.equalsIgnoreCase("cerebro")) {
            exibirEasterEggCerebro();
            return true;
        }
        return false;
    }

    private static void exibirEasterEggDottinha() {
        System.out.println("\nEm pleno século do mês do orgulho, você encontra esse easter egg");
        System.out.println("\nfeito por um hétero(ás vezes) e uma mulher bi(que namora homem)...");
        System.out.println("Parabéns!!! Adoramos você, e odiamos Java!!! <3<3<3<3");
        pausa(2000);
        pausa(2000);
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠤⠤⠤⠴⠶⠶⠒⠚⠋⠉⠉⠉⠉⣷⢀⣀⡤⠤⠶⠶⠒⠛⢶⡄⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡀⠀⣿⠉⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣇⣾⠀⠀⠀⠀⣴⡄⢠⣿⣄⡀⣰⠏⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠶⠚⠉⠉⠙⢦⣄⣀⣀⡟⠙⠋⠁⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢰⠋⢈⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠠⣆⠀⠀⢿⠀⢸⡶⢿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣤⣀⡼⠀⠀⠻⠀⠀⠙⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡖⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠳⣦⡀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠇⣿⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⡟⢳⣄⠀⠀⠀⠀⠙⣇⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⡿
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⢿⡀⠀⠀⠀⢀⡞⠁⠉⠓⠀⠀⠀⠀⣯⠴⠻⣆⠀⠀⠀⠀⢻⡆⠀⠀⠀⠻⠃⠀⠀⠀⠀⡇
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⢸⡇⠀⠀⠀⠘⣧⠀⠖⠚⣷⠀⠀⠀⣧⠀⠀⠘⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠘⡇⠀⠀⠀⠀⠘⠷⣤⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠞⠁⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠾⣦⠀⢸⡇⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⡤⠔⠚⠉⠀⠀⠀⠀
                ⠀⠀⣴⢦⣄⠀⠀⢀⣰⠏⠀⠘⣧⣿⠀⠀⠀⠀⢠⢾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⡤⠴⠶⠒⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⡏⠀⠈⠛⠋⠉⢀⣴⣿⣟⢿⡏⠀⠀⢀⡴⠋⠀⣧⠀⠀⢀⣀⣠⣤⣤⠤⠴⠒⠚⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⣧⢀⣴⣶⣶⡄⢾⣿⣿⡿⣸⠃⠀⢠⠞⠁⠀⠀⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⢿⣿⣿⣿⣿⣿⠘⢿⣭⡵⠋⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠈⠳⣬⣿⣭⠯⠖⠚⠁⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⣰⠏⠀⣀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⡼⢃⡴⠚⡿⠀⠀⠀⣤⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⢀⣾⠗⠋⠀⢠⡏⠀⠀⣸⠋⢷⡀⢹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠋⠁⣄⠀⢠⡿⡇⠀⢰⡏⠀⠀⠻⣮⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠙⠛⠋⠀⡇⢠⡟⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⣧⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
        pausa(2000);
        pausa(2000);
        System.out.printf("DITADOR DO JAVA");
        pausa(2000);
        pausa(2000);
        pausa(2000);
        pausa(2000);
    }

    private static void exibirEasterEggPinky() {
        System.out.println("\nQuerido usuárix (se for dotta, Olá senhor sensei)");
        System.out.println("você desbloqueou um dos nossos três easter eggs! xD");
        System.out.println("Esse ester egg foi feito pelo  PRODIGIO DOS BACK-END turma TI29!!! ;3");
        System.out.println("\n🕸️  PRESA SECRETA ENCONTRADA NO PROVETE DE VENENO 🧪");
        exibirCaixaSimples(" 🕷️ Pavitr Prabhakar theme song - Matheus vulgo Pinky", LARGURA_CAIXA);
        System.out.println();
        pausa(2000);
        pausa(2000);
        pausa(2000);
        pausa(2000);
    }

    private static void exibirEasterEggCerebro() {
        System.out.println("\nQuerido usuárix, você desbloqueou um dos nossos três easter eggs! xD");
        System.out.println("Esse ester egg foi feito pela MAIORAL DAS FRONT-END da turma TI29!!! xDD");
        System.out.println("\n🕸️  PRESA SECRETA ENCONTRADA NO PROVETE DE VENENO 🧪");
        exibirCaixaSimples(" 🕷️ Miles Morales theme song - Adriane vulgo Cérebro", LARGURA_CAIXA);
        System.out.println();
        pausa(2000);
        pausa(2000);
        pausa(2000);
        pausa(2000);
    }

    // ── Histórico ──────────────────────────────────────────────────────────

    public static void exibirCabecalhoHistorico() {
        System.out.println("\n🕸️  HISTÓRICO - ÚLTIMOS ÁUDIOS REPRODUZIDOS 🕸️\n");
    }

    public static void exibirItemHistorico(int posicao, String rotulo) {
        System.out.println(" [ " + posicao + " ] " + rotulo);
    }

    public static void msgHistoricoVazio() {
        System.out.println("🕸️ Sua teia ainda não fisgou nenhuma presa. Toque alguns áudios primeiro.");
    }

    // ── Relatório ──────────────────────────────────────────────────────────

    public static void exibirCabecalhoRelatorioPodcasts() {
        System.out.println("\n📊 [ RELATÓRIO DE PODCASTS POPULARES ] 🕸️");
        System.out.println("(Episódios com duração > 30 min e reproduções > 50, ordenados por likes)\n");
    }

    public static void exibirLinhaRelatorioPodcast(Podcast pod) {
        System.out.println(String.format(
                " 🎙️ Ep.%-3d | %-25s | Apresentador: %-18s | ⏳ %4.2f min | 🔊 Repro: %,5d | ❤️ Likes: %,5d",
                pod.getNumeroEpisodio(),
                pod.getTitulo(),
                pod.getApresentador(),
                pod.getDuracao(),
                pod.getRepro(),
                pod.getLikes()
        ));
    }

    public static void promptEnterContinuar() {
        System.out.println("\nPressione Enter para voltar ao menu principal...");
    }

    // ── Playlist ───────────────────────────────────────────────────────────

    public static void exibirCabecalhoPlaylist() {
        System.out.println("\n" + LINHA_LONGA);
        System.out.println("                                            🎵 SUA PLAYLIST PERSONALIZADA - QUADRADOS DA TEIA 🕸️");
        System.out.println(LINHA_LONGA);
    }

    public static void exibirInfoPlaylist(String titulo) {
        System.out.println("📌 Playlist: " + titulo);
        System.out.println(LINHA_MEDIA);
    }

    public static void msgPlaylistVazia() {
        System.out.println("🕸️ Sua playlist pessoal ainda está vazia! Adicione áudios na Opção [ 1 ] ou [ 3 ].");
        promptEnterContinuar();
    }

    public static void promptEscolherAudioPlaylist(int total) {
        System.out.println("Digite o número do áudio da playlist que quer dar PLAY (de 1 a " + total + "):");
    }

    public static void msgNumeroPlaylistInvalido() {
        System.out.println("⚠️ Número fora da teia da playlist!");
    }

    // ── Utilitários visuais ────────────────────────────────────────────────

    public static void exibirListaDupla(List<AudioItem> itens, int larguraCaixa) {
        for (int i = 0; i < itens.size(); i += 2) {
            String linhaM1 = formatarLinha(itens, i, larguraCaixa);

            String linhaM2;
            if (i + 1 < itens.size()) {
                linhaM2 = formatarLinhaComMargem(itens, i + 1, larguraCaixa);
            } else {
                linhaM2 = "    " + " ".repeat(larguraCaixa);
            }

            String border = "+" + "=".repeat(larguraCaixa - 2) + "+";
            System.out.println(border + (i + 1 < itens.size() ? "   " + border : ""));
            System.out.println(linhaM1 + linhaM2);
            System.out.println(border + (i + 1 < itens.size() ? "   " + border : ""));
            System.out.println();
        }
    }

    private static String formatarLinha(List<AudioItem> itens, int indice, int larguraCaixa) {
        AudioItem item = itens.get(indice);
        String numero = indice < 9 ? "0" + (indice + 1) : String.valueOf(indice + 1);
        String texto = " [ " + numero + " ] " + item.getRotuloExibicao();
        if (texto.length() > larguraCaixa - 2) {
            texto = texto.substring(0, larguraCaixa - 5) + "...";
        }
        return String.format("| %-" + (larguraCaixa - 3) + "s|", texto);
    }

    private static String formatarLinhaComMargem(List<AudioItem> itens, int indice, int larguraCaixa) {
        return "   " + formatarLinha(itens, indice, larguraCaixa);
    }

    public static void exibirCaixaSimples(String texto, int largura) {
        if (texto.length() > largura - 2) {
            texto = texto.substring(0, largura - 5) + "...";
        }
        String linha = String.format("| %-" + (largura - 3) + "s|", texto);
        String border = "+" + "=".repeat(largura - 2) + "+";
        System.out.println(border);
        System.out.println(linha);
        System.out.println(border);
    }

    public static void pausa(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
