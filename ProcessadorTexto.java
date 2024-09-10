import java.io.*;
import java.util.StringTokenizer;

public class ProcessadorTexto {
    public void processarTexto(String caminhoTexto, TabelaHash tabela) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(caminhoTexto));
        String linha;
        int numeroLinha = 1;
        
        while ((linha = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linha, " .,;:!?()[]\"\'-");
            while (st.hasMoreTokens()) {
                String palavra = st.nextToken().toLowerCase();
                tabela.inserirPalavra(palavra, numeroLinha);
            }
            numeroLinha++;
        }
        reader.close();
    }

    public void gerarIndice(String caminhoSaida, TabelaHash tabela, String caminhoPalavrasChave) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(caminhoPalavrasChave));
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoSaida));
        String palavraChave;

        while ((palavraChave = reader.readLine()) != null) {
            Palavra palavra = tabela.buscarPalavra(palavraChave.toLowerCase());
            if (palavra != null) {
                writer.write(palavra.toString());
                writer.newLine();
            }
        }
        reader.close();
        writer.close();
    }
}
