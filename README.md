# Genius Game API | Arena Pixel

Uma API para o jogo Genius (também conhecido como Simon), onde os jogadores devem repetir uma sequência cada vez mais longa de cores.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.1
- Maven 3.9.6

## Pré-requisitos

Antes de iniciar, certifique-se de que tem instalado:
- JDK 21 [versão recomendada]
- Maven 3.9.6 [versão recomendada]
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VSCode, etc.)

## Como Subir a Aplicação

Para iniciar a aplicação:

1. Clone o repositório: git clone [URL do repositório]
2. Navegue até a pasta do projeto: cd [nome-da-pasta]
3. Para iniciar a aplicação, execute: ./mvnw spring-boot:run

## Endpoints da API

Lista dos principais endpoints da API:

- `POST /game/start` - Inicia um novo jogo
- `POST /game/play` - Envia a sequência do jogador e recebe o resultado (acerto ou erro)
- `GET /game/score` - Obtém a pontuação atual do jogador
- `GET /game/gameover` - Verifica se o jogo terminou

## Como Executar os Testes

Para executar os testes unitários:

1. Navegue até a pasta do projeto: cd [nome-da-pasta]
2. Execute os testes com o comando: ./mvnw test