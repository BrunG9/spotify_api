# Spotify API Integration - Java

Este projeto tem como objetivo demonstrar como consumir a API do Spotify utilizando Java. Através dessa implementação, é possível interagir com diversos endpoints da API do Spotify para acessar informações sobre músicas, álbuns, artistas, playlists e muito mais.

## Funcionalidades

- **Autenticação via OAuth**: Realize o processo de autenticação necessário para acessar a API do Spotify.
- **Buscar Músicas, Artistas e Álbuns**: Permite realizar buscas na plataforma do Spotify.
- **Obter Detalhes de Músicas e Playlists**: A API possibilita acessar informações detalhadas sobre músicas e playlists específicas.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework utilizado para facilitar o desenvolvimento da aplicação.
- **Spotify API**: API utilizada para integrar os dados de música, artistas e playlists.

## Como Rodar o Projeto

1. Clone o repositório:

    ```bash
    git clone https://github.com/BrunG9/spotify_api.git
    ```

2. Navegue até a pasta do projeto:

    ```bash
    cd spotify_api
    ```

3. Instale as dependências utilizando o Maven:

    ```bash
    mvn clean install
    ```

4. Execute o projeto:

    ```bash
    mvn spring-boot:run
    ```

5. A API estará disponível para requisições no seu terminal ou através de um cliente HTTP (como o Postman ou Insomnia).

## Configuração de Autenticação

Para interagir com a API do Spotify, é necessário configurar as credenciais de autenticação:

1. Crie um aplicativo no [Spotify Developer Dashboard](https://developer.spotify.com/dashboard/applications).
2. Obtenha o `Client ID` e `Client Secret` e configure-os no seu arquivo de propriedades ou no código conforme necessário.
