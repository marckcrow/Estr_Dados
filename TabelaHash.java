import java.util.LinkedList;

public class TabelaHash {
    private LinkedList<Palavra>[] tabela;

    @SuppressWarnings("unchecked")
    public TabelaHash() {
        tabela = new LinkedList[26]; // Tabela para 26 letras (a-z)
        for (int i = 0; i < 26; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(String palavra) {
        // Função hash baseada na primeira letra da palavra (a -> 0, b -> 1, ..., z -> 25)
        return palavra.toLowerCase().charAt(0) - 'a';
    }

    public void inserirPalavra(String palavra, int linha) {
        int indice = hash(palavra);
        for (Palavra p : tabela[indice]) {
            if (p.getPalavra().equals(palavra)) {
                p.adicionarOcorrencia(linha);
                return;
            }
        }
        Palavra novaPalavra = new Palavra(palavra);
        novaPalavra.adicionarOcorrencia(linha);
        tabela[indice].add(novaPalavra);
    }

    public Palavra buscarPalavra(String palavra) {
        int indice = hash(palavra);
        for (Palavra p : tabela[indice]) {
            if (p.getPalavra().equals(palavra)) {
                return p;
            }
        }
        return null;
    }
}
