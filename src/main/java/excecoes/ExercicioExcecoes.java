package excecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioExcecoes {

    //constante
    private static final List<String> CIDADESPROF = Arrays.asList("Sao Paulo", "Rio de Janeiro", "POA");


    public static void main (String[] args){

        List<String> cidades = new ArrayList<>();
        cidades.add("Porto Alegre");
        cidades.add("Curitiba");
        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Cuiaba");
        cidades.add("Sao Luis");

        // Declarando com Array.asList()
        List<String> cidadesprof = Arrays.asList("Sao Paulo", "Rio de Janeiro", "POA");
        List<String> cidades2 = Arrays.asList("Porto Alegre", "Rio de Janeiro", "Curitiba");

       Integer posicao = null;

       while (true) {
       try{
            posicao = pedirPosicaoUsuario();
            break;
        }
        catch(PosicaoInvalidaException e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();
           // return; //encerra a execucao do main. Pq eh um metodo void, posso fazer isso
        }

        }
        String nomeCidade = cidades.get(posicao);
        System.out.println(nomeCidade);

    }

    public static Integer pedirPosicaoUsuario() throws PosicaoInvalidaException{
        System.out.println("Informe o numero correspondente a posicao na lista de cidades: ");
        Integer posicao = new Scanner(System.in).nextInt();

        if (posicao < 0 || posicao > 5) {
            throw new PosicaoInvalidaException("Opcao Invalida, informe uma opcao de 0 a 5");
        }
        return posicao;
    }


}