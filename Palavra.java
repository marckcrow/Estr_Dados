import java.util.LinkedList;

public class Palavra {
    private String palavra;
    private LinkedList<Integer> ocorrencias;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.ocorrencias = new LinkedList<>();
    }

    public void adicionarOcorrencia(int linha) {
        ocorrencias.add(linha);
    }

    public String getPalavra() {
        return palavra;
    }

    public LinkedList<Integer> getOcorrencias() {
        return ocorrencias;
    }

    @Override
    public String toString() {
        // Formata a lista de ocorrências como uma string separada por vírgulas
        String ocorrenciasStr = ocorrencias.toString().replaceAll("[\\[\\]]", "");
        return palavra + ": [" + ocorrenciasStr + "]";
    }
}
