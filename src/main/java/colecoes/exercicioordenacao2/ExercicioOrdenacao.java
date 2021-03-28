package colecoes.exercicioordenacao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExercicioOrdenacao {

    public static void main (String[] args){

        Produto produto1 = new Produto("Creme Dental", 2.49F, 2.99F);
        Produto produto2 = new Produto("Sabonete em Barra Corporal 90g", 2.99F, 3.30F);
        Produto produto3 = new Produto("Protetor Solar 30FPS 200ml", 37.39F, 39.12F);
        Produto produto4 = new Produto("Fralda P confort", 44.9F, 44.9F);
        Produto produto5 = new Produto("Condicionaor", 18.9F, 15F);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        System.out.println("------- Imprimindo por nome (ordem padrao) ------- ");
        Collections.sort(produtos);
        for(Produto produto : produtos){
            System.out.println(produto.getDescricao());
        }

        System.out.println("\n------- Imprimindo ordenado por custo ------ ");
        Collections.sort(produtos, new ProdutoByCustoComparator());
        for(Produto produto : produtos){
            System.out.println(produto.getDescricao());
        }

        System.out.println("\n------- Imprimindo ordenada por lucro ------- ");
        Collections.sort(produtos, new ProdutoByLucroComparator());
        for(Produto produto : produtos){
            System.out.println(produto.getDescricao());
        }





    }
}
