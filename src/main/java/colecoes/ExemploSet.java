package colecoes;

import java.util.*;

public class ExemploSet {

    public static void main (String[] args) {

        //HashSet<String> pessoas = new HashSet<>();
        //Set eh a super classe, entao pode ser usado no lado esquerdo
        //Set<String> pessoas = new HashSet<>(); //nao garante a ordem
        //Set<String> pessoas = new LinkedHashSet<>();
        Set<String> pessoas = new TreeSet<>();


        System.out.println(pessoas.add("Tom"));
        System.out.println(pessoas.add("John"));
        System.out.println(pessoas.add("Mary"));
        System.out.println(pessoas.add("Peter"));
        System.out.println(pessoas.add("David"));
        System.out.println(pessoas.add("Alice"));
        System.out.println(pessoas.add("tom"));
        System.out.println(pessoas.add("Alice"));
        System.out.println(pessoas.add("Gilberto"));
        System.out.println("-----");

        for (String pessoa : pessoas){
            System.out.println(pessoa);
        }

        System.out.println("-----");

        HashSet<Integer> quantidades = new HashSet<>();
        quantidades.add(3);
        quantidades.add(2);
        quantidades.add(1);
        quantidades.add(4);
        quantidades.add(5);
        quantidades.add(6);
        quantidades.add(6);

        for (Integer qtd : quantidades){
            System.out.println(qtd);
        }

        System.out.println("-----");

        Iterator<Integer> quantidadesIterator = quantidades.iterator();

        System.out.println(quantidadesIterator.hasNext());

        System.out.println("-----");

        while (quantidadesIterator.hasNext()){
            System.out.println(quantidadesIterator.next());
        }



    }
}
