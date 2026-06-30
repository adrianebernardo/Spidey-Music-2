import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<AudioItem> carregarBanco() {
        List<AudioItem> banco = new ArrayList<>();

        Musica m1 = new Musica("Manchild", "Sabrina Carpenter", 3.12);
        m1.inicializarDados(4320, 812);
        banco.add(m1);

        Musica m2 = new Musica("Dracula", "Teme Impala", 4.05);
        m2.inicializarDados(1250, 245);
        banco.add(m2);

        Musica m3 = new Musica("Duality", "Slipknot", 4.12);
        m3.inicializarDados(8940, 1620);
        banco.add(m3);

        Musica m4 = new Musica("Vandetta nerd", "Bully", 2.50);
        m4.inicializarDados(3110, 423);
        banco.add(m4);

        Musica m5 = new Musica("Unshaken", "Red dead Redemption 2", 3.53);
        m5.inicializarDados(6780, 1150);
        banco.add(m5);

        Musica m6 = new Musica("Jane", "The long faces", 4.31);
        m6.inicializarDados(2150, 390);
        banco.add(m6);

        Musica m7 = new Musica("Judas", "Lady Gaga", 4.09);
        m7.inicializarDados(9420, 2100);
        banco.add(m7);

        Musica m8 = new Musica("Video Games", "lana Del Rey", 4.42);
        m8.inicializarDados(7810, 1480);
        banco.add(m8);

        Musica m9 = new Musica("Smells like a teen spirit", "Nirvana", 5.01);
        m9.inicializarDados(9980, 2340);
        banco.add(m9);

        Musica m10 = new Musica("Julieta", "Kamaitachi", 3.38);
        m10.inicializarDados(5430, 915);
        banco.add(m10);

        Musica m11 = new Musica("P.I.T.T.Y", "NandaTsunami", 3.25);
        m11.inicializarDados(1120, 184);
        banco.add(m11);

        Musica m12 = new Musica("Shimy Shimy Ya", "Dirty Bastard", 40.00);
        m12.inicializarDados(3650, 512);
        banco.add(m12);

        Podcast p1 = new Podcast("É possível programar em Python sem rebolar para os crias?", "Math Dúvidas", 4, 78.30);
        p1.inicializarDados(50000, 78545);
        banco.add(p1);

        Podcast p2 = new Podcast("De frente com Dottinha Sensei", "Mr. José Dotta", 9, 45.74);
        p2.inicializarDados(890, 210);
        banco.add(p2);

        Podcast p3 = new Podcast("De canto a paldeia detonado", "Mestre Pokémon", 10, 74.00);
        p3.inicializarDados(1515, 1);
        banco.add(p3);

        Podcast p4 = new Podcast("Um dabate insano: Frontend vs Backend", "Adriane e Matheus", 67, 67.6);
        p4.inicializarDados(54213248, 123156);
        banco.add(p4);

        AudioBook a1 = new AudioBook("O causador do coringamento: Java", "Todos estudantes de TI", 69, 45.00);
        a1.inicializarDados(155555555, 15555555);
        banco.add(a1);

        AudioBook a2 = new AudioBook("Desvalorização do Frontend", "Adriane de Frente", 5, 80.00);
        a2.inicializarDados(10, 3);
        banco.add(a2);

        AudioBook a3 = new AudioBook("Por que formigas são equivalentes a nazistas?", "M.Questionamentos", 6, 66.55);
        a3.inicializarDados(1000000000, 3);
        banco.add(a3);

        AudioBook a4 = new AudioBook("O capitalismo falhou, falha e falhará", "Adriane Marxista", 1, 60.80);
        a4.inicializarDados(3500, 45);
        banco.add(a4);

        return banco;
    }
}