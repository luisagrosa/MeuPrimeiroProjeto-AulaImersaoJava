package colecoes.exercicioordenacao2;

import java.util.Comparator;

public class ProdutoByCustoComparator implements Comparator<Produto> {

    public int compare(Produto p1, Produto p2){

        if(p1 == null || p1.getCustoAquisicao() == null){
            return -1;
        }

        if(p2 == null ||  p2.getCustoAquisicao() == null) {
            return 1;
        }
        return p1.getCustoAquisicao().compareTo(p2.getCustoAquisicao());

    }
}
