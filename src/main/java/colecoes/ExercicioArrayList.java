package colecoes;

import java.util.*;

public class ExercicioArrayList {

    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Kierten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrylin");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        ArrayList<String> primeiros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            primeiros.add(pessoas.get(i));
        }



        Collections.sort(primeiros);

        for (String nome : primeiros) {
            System.out.println(nome);
        }

        System.out.println("-----USANDO ITERATOR AO INVES DO FOR----");

        Iterator<String> primeirosIterator = primeiros.iterator();
        while(primeirosIterator.hasNext()){
            System.out.println(primeirosIterator.next());
        }

        System.out.println("-----REMOVENDO DUPLICADOS----");

        ArrayList<String> pessoasNaoDuplicadas = new ArrayList<>();
        for(String pessoa : pessoas){
            if (pessoasNaoDuplicadas.contains(pessoa) == false){
                pessoasNaoDuplicadas.add(pessoa);
            }
        }

        for (String person : pessoasNaoDuplicadas){
            System.out.println(person);
        }
        System.out.println("------- TREINANDO MAIS UM POUCO O ITERATOR -------");
        Iterator<String> pessoasNaoDuplicadasIterator = pessoasNaoDuplicadas.iterator();

        while(pessoasNaoDuplicadasIterator.hasNext()){
            System.out.println(pessoasNaoDuplicadasIterator.next());
        }


        System.out.println("-----REMOVENDO DUPLICADOS COM SET----");

        //Set <String> pessoasNaoDuplicadasSet = new TreeSet<>();

        //for (String pessoa : pessoas){
        //    pessoasNaoDuplicadasSet.add(pessoa);
        //}
        //nao preciso usar esse for ai de cima, pois existe o ADDALL. Melhoria 1:

        //pessoasNaoDuplicadasSet.addAll(pessoas);


        // Existe um cosntrutor pra passar direto uma colecao existente. Melhoria 2:
        Set <String> pessoasNaoDuplicadasSet = new TreeSet<>(pessoas);



        for (String person : pessoasNaoDuplicadasSet) {
            System.out.println(person);
        }

    }
}
