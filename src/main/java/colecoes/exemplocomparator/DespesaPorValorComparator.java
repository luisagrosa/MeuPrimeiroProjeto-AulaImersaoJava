package colecoes.exemplocomparator;

import java.util.Comparator;

public class DespesaPorValorComparator implements Comparator<Despesa> {
    public int compare(Despesa d1, Despesa d2){
        return d1.getValor().compareTo(d2.getValor());
    }
}
