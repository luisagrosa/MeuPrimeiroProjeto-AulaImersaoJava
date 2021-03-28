package colecoes.exercicioordenacao2;

import java.util.Comparator;

public class ProdutoByLucroComparator implements Comparator<Produto> {

    public int compare (Produto p1, Produto p2) {
        Float lucrop1 = p1.getLucro();
        Float lucrop2 = p2.getLucro();

        return lucrop1.compareTo(lucrop2);
    }
}
