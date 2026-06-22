# 🕷️ Spidey Music
> Sistema de streaming de música via console, desenvolvido em Java.
> Trabalho Avaliativo 1 — Paradigmas de Programação — Fundatec

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
- Tocar músicas e dar like
- Cadastrar novas músicas com validação de dados
- Pesquisar música por título
- Histórico das últimas 5 músicas reproduzidas
- Relatório de populares ordenado por likes com Java Streams
- Playlist pessoal do usuário

## 🏗️ Arquivos
- `App.java` — Menu principal e lógica de navegação
- `Musica.java` — Entidade música com encapsulamento rígido
- `Playlist.java` — Playlist pessoal do usuário
- `User.java` — Entidade usuário

## 📐 Conceitos de POO Aplicados
- **Encapsulamento** — atributos `private`, estado alterado apenas por `tocar()` e `likar()`
- **Abstração** — cada classe gerencia suas próprias regras
- **Java Streams** — relatório com `.filter()` e `.sorted()`
- **Array rotativo** — histórico de reprodução com lógica imperativa

## 🌱 Seed de Música 
- Logo após a inicialização, o sistema disponibiliza doze faixas de música já configuradas, incluindo contadores pré-definidos de reproduções e curtidas.

## ❓ Funções escondidas
- **Cenário 1** — Pesquisar por "cerebro"
- **Cenário 2** — Pesquisar por "pinky"
- **Cenário 3** — Pesquisar por "dottinha"

