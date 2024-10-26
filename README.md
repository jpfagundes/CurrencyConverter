<h1 align="center">  💵 Conversor de Moedas 💵 </h1>

Este é um conversor de moedas simples que utiliza a API ExchangeRate para converter valores entre diferentes moedas. O usuário informa as moedas de origem e destino, além do valor a ser convertido, e o programa retorna o valor convertido com base na taxa de câmbio atual.

## Índice

- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Autor](#autor)
- [Contato](#contato)

## Descrição

O Conversor de Moedas permite que o usuário converta um 
valor entre duas moedas diferentes utilizando taxas de câmbio 
obtidas de uma API externa. O programa é interativo e executado
em linha de comando, pedindo ao usuário para informar a moeda de 
origem, a moeda de destino e o valor a ser convertido. Em seguida, 
ele calcula e exibe o valor convertido.

## Funcionalidades

- 💱 Conversão de moedas utilizando taxas de câmbio atualizadas.
- 🌍 Suporte para qualquer moeda com código de três letras (por exemplo, BRL, USD, EUR).
- ✔️ Validação para garantir que as moedas informadas sejam suportadas pela API.

## Tecnologias Utilizadas

- **Java** - Linguagem de programação principal.
- **Gson** - Biblioteca para manipulação de JSON.
- **HttpClient** - Para realizar requisições HTTP.
- **ExchangeRate API** - API externa para obter as taxas de câmbio.

## Instalação

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/conversor-de-moedas.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd conversor-de-moedas
    ```

3. Importe o projeto em sua IDE favorita (por exemplo, IntelliJ, Eclipse).

4. Certifique-se de ter o Java 11 ou superior instalado.

5. Adicione a biblioteca Gson ao seu projeto (você pode baixá-la [aqui](https://repo1.maven.org/maven2/com/google/code/gson/gson/) ou usar uma ferramenta de gerenciamento de dependências como Maven ou Gradle).

## Como Usar

1. Execute o programa. O terminal solicitará os seguintes dados:
    - Moeda de origem (código de três letras, ex.: BRL)
    - Moeda de destino (código de três letras, ex.: USD)
    - Valor a ser convertido

2. O programa exibirá o valor convertido com base na taxa de câmbio atual.

### Exemplo de uso

```plaintext
*********************************
 
Olá! Seja bem vindo ao meu Conversor de Moedas!

Digite o código de três letras das moedas que deseja converter,
(Ex.: Real Brasileiro: BRL) em seguida o valor para conversão.

*********************************

Digite a moeda de origem:
BRL
Digite a moeda destino:
USD
Digite o valor para conversão:
100
O valor convertido é 20.13 USD
```

## Autor

- [@jpfagundes](https://www.github.com/jpfagundes)

## Contato

- [Email] jpsafagundes@hotmail.com

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jpfagundes/)