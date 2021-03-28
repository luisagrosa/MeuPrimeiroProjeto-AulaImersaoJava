package colecoes.exemplocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AplicacaoDespesas {

    public static void main(String[] args){

        Despesa despesa1 = new Despesa("Netlfix", 22.5F);
        Despesa despesa2 = new Despesa("Amazon", 9.99F);
        Despesa despesa3 = new Despesa("Feira", 60F);
        Despesa despesa4 = new Despesa("iFood", 150F);

        List<Despesa> despesas = new LinkedList<>();

        despesas.add(despesa1);
        despesas.add(despesa2);
        despesas.add(despesa3);
        despesas.add(despesa4);

        Collections.sort(despesas);


        System.out.println("Ordenacao por descricao:");
        for (Despesa desp : despesas){
            System.out.println(desp.getDescricaoCompleta());
        }

        Collections.sort(despesas, new DespesaPorValorComparator()); //Comparator
        System.out.println("Ordenacao por valor");
        for (Despesa desp : despesas){
            System.out.println(desp.getDescricaoCompleta());
        }


    }
}
