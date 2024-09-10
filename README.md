# Estr_Dados
# Índice Remissivo

Este projeto visa desenvolver um programa para criar um índice remissivo a partir de um texto e palavras-chave fornecidas. O índice remissivo facilita a localização de termos importantes em um texto ao associá-los às linhas onde ocorrem.

## Objetivo

O objetivo do projeto é:

1. Ler um texto de tamanho arbitrário.
2. Processar as palavras do texto e armazenar suas ocorrências nas estruturas de dados apropriadas.
3. Ler um arquivo contendo palavras-chave e gerar o índice remissivo.
4. O índice deve ser gerado de maneira ordenada e formatada corretamente.

## Estruturas de Dados

O projeto utiliza as seguintes estruturas de dados:

- **Tabela de Dispersão (Hash):** Para armazenar e buscar palavras com eficiência.
- **Listas Encadeadas:** Para armazenar as ocorrências de cada palavra.

## Funcionamento

### Passos:

1. **Processamento do Texto:**
   - O programa lê um arquivo de texto e armazena as palavras e suas ocorrências de linha na tabela hash.

2. **Geração do Índice Remissivo:**
   - O programa lê um arquivo com palavras-chave.
   - Para cada palavra-chave, busca-se na tabela hash e escreve-se as ocorrências em um arquivo de saída.

## Arquivos

- **`Palavra.java`**: Define a classe `Palavra` com atributos para a palavra e suas ocorrências.
- **`TabelaHash.java`**: Implementa a tabela hash para armazenar palavras e suas ocorrências.
- **`IndiceRemissivo.java`**: Controla o fluxo do programa, processa o texto e gera o índice remissivo.

## Compilação e Execução

1. **Compilação:**

   ```bash
   javac Palavra.java TabelaHash.java IndiceRemissivo.java
