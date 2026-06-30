# 🕷️ Spidey Music
> Sistema de streaming de música via console, desenvolvido em Java.
> Trabalho Avaliativo 2 — Paradigmas de Programação — Fundatec

---

## 👥 Autores da turma TI29
- Adriane da Cruz Bernardo
- Matheus Oliveira Eufrazio

## 🏫 Informações Acadêmicas
- **Disciplina:** Paradigmas de Programação
- **Professor:** José H. Dotta
- **Instituição:** Fundatec
- **Cenário:** 1 — Streaming de Música e Áudio

---

## ⚙️ Como compilar e executar
Pré-requisitos: Java JDK 17 ou superior instalado, terminal aberto na pasta do projeto.

Compilar: `javac *.java`
Executar: `java App`

**Via IntelliJ IDEA** — abrir a pasta do projeto e clicar no botão Run (▶️) no arquivo `App.java`

---

## 🕸️ Funcionalidades
- Cadastro e login de usuário com validação de e-mail
- Tocar áudios (músicas, podcasts ou audiobooks) e dar like
- Cadastrar novos áudios com sub-menu de escolha de tipo e validação de dados
- Pesquisar áudio por título
- Histórico das últimas 5 reproduções (genérico, aceita qualquer tipo de áudio)
- Relatórios por categoria ordenados por reproduções, com Java Streams
- Relatório exclusivo de podcasts populares (duração > 30min e reproduções > 50, ordenado por likes)
- Playlist pessoal do usuário com coleção polimórfica

## 🏗️ Arquivos
- `App.java` — Menu principal e lógica de navegação
- `AudioItem.java` — Classe abstrata base da hierarquia de áudio
- `Musica.java` — Subclasse concreta de áudio (música)
- `Podcast.java` — Subclasse concreta de áudio (podcast)
- `AudioBook.java` — Subclasse concreta de áudio (audiobook)
- `Playlist.java` — Playlist pessoal do usuário (coleção polimórfica de `AudioItem`)
- `Relatorio.java` — Relatórios com Streams sobre a lista polimórfica
- `Data.java` — Carga inicial do banco de áudios
- `Decoracoes.java` — Textos e elementos visuais do console
- `User.java` — Entidade usuário

## 📐 Conceitos de POO Aplicados (Trabalho 2)
- **Herança** — `AudioItem` como classe abstrata base; `Musica`, `Podcast` e `AudioBook` como subclasses concretas (estrutura de 2 níveis)
- **Polimorfismo** — métodos abstratos `tocar()`, `getRotuloExibicao()` e `getCategoria()` sobrescritos com `@Override` em cada subclasse
- **Coleção Unificada** — `bancoAudio`, `Playlist` e o histórico de reprodução são tipados com a classe base `AudioItem` (upcasting), sem listas separadas por tipo
- **Fluxo sem condicionais de tipo** — `tocarAudio()` não usa `instanceof`; a filtragem por categoria é feita via `getCategoria()`, definido polimorficamente em cada subclasse
- **Encapsulamento** — atributos `private`, estado alterado apenas por métodos como `tocar()` e `likar()`
- **Java Streams** — relatórios com `.filter()`, `.sorted()`, `.map()` e `.limit()` sobre a lista polimórfica
- **Array rotativo** — histórico de reprodução com lógica imperativa, agora genérico para qualquer subclasse de `AudioItem`

## 🌱 Seed de Áudio
- Logo após a inicialização, o sistema disponibiliza doze músicas, quatro podcasts e quatro audiobooks já configurados, incluindo contadores pré-definidos de reproduções e curtidas.

## ❓ Funções escondidas
- **Cenário 1** — Pesquisar por "cerebro"
- **Cenário 2** — Pesquisar por "pinky"
- **Cenário 3** — Pesquisar por "dottinha"