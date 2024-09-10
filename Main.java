import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();
        ProcessadorTexto processador = new ProcessadorTexto();

        try {
            // Processa o arquivo de texto e insere as palavras na Tabela Hash
            processador.processarTexto("texto.txt", tabela);

            // Gera o índice remissivo baseado nas palavras-chave
            processador.gerarIndice("indiceRemissivo.txt", tabela, "palavras-chave.txt");

            System.out.println("Índice remissivo gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
