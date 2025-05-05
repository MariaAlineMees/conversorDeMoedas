# Conversor de Moeda em Java

Este é um conversor de moeda desenvolvido em Java, durante o curso da Alura que permite a conversão entre diferentes moedas, como o Dólar Americano (USD), Euro (EUR), Iene Japonês (JPY), entre outras. A taxa de conversão é obtida dinamicamente a partir de uma API pública de taxas de câmbio.

## Funcionalidades

- O usuário escolhe a moeda de origem e a moeda de destino.
- O programa solicita o valor que será convertido.
- A conversão é realizada com base nas taxas de câmbio obtidas em tempo real via API externa.
- O programa exibe o resultado da conversão e a taxa de câmbio atual.

## Como Usar

1. Clone este repositório para sua máquina local:

    ```bash
    git clone https://github.com/MariaAlineMees/conversor-de-moeda.git
    ```

2. Compile e execute o código em Java:

    ```bash
    javac Main.java
    java Main
    ```

3. O programa solicitará as entradas:
    - Escolha a moeda de origem (ex: USD).
    - Escolha a moeda de destino (ex: EUR).
    - Digite o valor para conversão.
    - O programa exibirá o valor convertido e a taxa de câmbio atual.

4. Você pode fazer várias conversões enquanto desejar, ou sair digitando "n" quando perguntado se deseja realizar outra conversão.

## Estrutura do Projeto

O projeto contém os seguintes arquivos principais:

- **Main.java**: Contém a lógica de interação com o usuário, onde o usuário escolhe as moedas e os valores para conversão.
- **ConversorDeMoeda.java**: Classe responsável pela lógica de conversão entre as moedas, utilizando a API de taxas de câmbio.

## Exemplo de Execução

Conversor de Moedas
Escolha a moeda de origem:
[0] USD - Dólar Americano
[1] EUR - Euro
[2] JPY - Iene Japonês
[3] GBP - Libra Esterlina
[4] AUD - Dólar Australiano
[5] CAD - Dólar Canadense
[6] CHF - Franco Suíço
[7] CNY - Yuan Chinês
[8] ARS - Peso Argentino
[9] NZD - Dólar Neozelandês
[10] BRL - Real Brasileiro

Escolha a moeda de destino:
[0] USD - Dólar Americano
[1] EUR - Euro
[2] JPY - Iene Japonês
[3] GBP - Libra Esterlina
[4] AUD - Dólar Australiano
[5] CAD - Dólar Canadense
[6] CHF - Franco Suíço
[7] CNY - Yuan Chinês
[8] ARS - Peso Argentino
[9] NZD - Dólar Neozelandês
[10] BRL - Real Brasileiro

Digite o valor para converter: 100

100.00 USD (Dólar Americano) = 92.13 EUR (Euro)

Atualmente, 1 USD equivale a 0.9213 EUR.

Deseja fazer outra conversão? (s/n): s

## Dependências

- **Java 11 ou superior**: O código utiliza a API `HttpClient` do Java, que está disponível a partir do Java 11.
- **Biblioteca Gson**: Para o parseamento da resposta JSON da API de taxas de câmbio.

## Como Funciona
A classe ConversorDeMoeda utiliza a API ExchangeRate-API para obter as taxas de conversão em tempo real. A URL da API é construída com base nos códigos das moedas fornecidos pelo usuário (exemplo: USD para EUR) e a resposta da API é usada para calcular a conversão.

Nota: As taxas de câmbio podem mudar com o tempo, então as conversões podem variar dependendo do momento da solicitação.

### Contribuições
Sinta-se à vontade para abrir uma issue ou enviar um pull request se você tiver melhorias ou correções para o projeto.

### Licença
Este projeto é de código aberto sob a licença MIT.

Desenvolvido por Maria Aline Mees.
