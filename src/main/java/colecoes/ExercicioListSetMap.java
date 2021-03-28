package colecoes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ExercicioListSetMap {

    public static void main (String[] args) throws IOException {

        ArrayList<String> campeoes = new ArrayList<>();
        Scanner sc = new Scanner(Path.of("/home/greyce/IdeaProjects/MeuPrimeiroProjeto/src/main/resources/campeoes.txt"));

        while (sc.hasNext()) {
            String linha = sc.nextLine();
            linha = linha.substring(7);
            campeoes.add(linha);
        }

        HashMap<String, Integer> quantidadeTitulos = new HashMap<String, Integer>();

        for (String pais : campeoes){
            String valorPais = pais;
            Integer contagem = 0;
            for (String paisDeNovo:campeoes){
                if (paisDeNovo.equalsIgnoreCase(pais)){
                    contagem = contagem +1;
                }
            }
            quantidadeTitulos.put(valorPais, contagem);
        }

        for(Map.Entry<String, Integer> entryQuantidadeTitulos : quantidadeTitulos.entrySet()){
            System.out.printf("O pais %s ganhou %d titulos!\n", entryQuantidadeTitulos.getKey(), entryQuantidadeTitulos.getValue());
        }

        System.out.println("imprimindo antes de ordenar");
        for (String campeao :campeoes){
            System.out.println(campeao);
        }

        System.out.println("imprimindo depois de ordenar");
        Collections.sort(campeoes);
        for (String campeao :campeoes){
            System.out.println(campeao);
        }

    }
}
