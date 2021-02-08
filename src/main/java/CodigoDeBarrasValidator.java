import java.util.Scanner;

public class CodigoDeBarrasValidator {

    public static void main(String[] args){

       /*
       //Fazendo o metodo dentro do main:

        int[] codigoBarras = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,6};
        int soma = 0;
        for(int i = 0; i < codigoBarras.length - 2; i++){
            soma = soma + codigoBarras[i];
        }
        System.out.println(soma);

        boolean valido = false;
        if (soma == 0){
            if(codigoBarras[20] == 0 && codigoBarras[21] == 0) {
                valido = true;
            }
        } else if (soma <=99) {

            int decimal = soma/10;
            int unidade = soma%10;

            if(codigoBarras[20] == decimal && codigoBarras[21] == unidade){
                valido = true;
            }
        } //else if (soma > 99){}

        if(valido == true) {System.out.println("Valido!!");}
        if(valido == false) {System.out.println("NAO eh valido!!");}


        // chamando o metodo que ta fora do main (CodigodeBarrasValidatorV2)
        int[] codigoBarras3 = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,10,10,3,0};
        boolean seraQueEhValido = CodigoDeBarrasValidatorV2(codigoBarras3);
        if(seraQueEhValido == true) {System.out.println("Valido!!");}
        if(seraQueEhValido == false) {System.out.println("NAO eh valido!!");}

        */

        //Exemplos de Codigos
        ////Inválidos
        //        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,4,3};// Deveria ser 86
        //        int[] codigoBarras = {4,2,4,2,3,4,2,3,4,2,3,4,2,4,2,3,4,2,3,4,2,3};//Digito 61 - invalido
        //        //int[] codigoBarras = {1,2,7,9,1,9};//Menor tamanho - inválido
        ////Válidos
        //        //int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,8,6};
        //        //int[] codigoBarras = {9,8,8,9,9,9,7,9,9,9,8,9,9,9,8,9,7,9,7,9,7,0};//Digito 170

        int[] codigoBarras = {2,1,3,5,7,8,5,5,5,2,3,4,1,2,3,4,5,6,7,8,4,3};

        System.out.println(CodigoDeBarrasValidatorV3(codigoBarras));

    }


    public static boolean CodigoDeBarrasValidatorV2(int[] meuArrayDeCodigo) {
        int soma = 0;
        for(int i = 0; i < meuArrayDeCodigo.length - 2; i++){
            soma = soma + meuArrayDeCodigo[i];
        }
        System.out.println(soma);

       boolean valido = false;

        if (soma == 0){
            if(meuArrayDeCodigo[20] == 0 && meuArrayDeCodigo[21] == 0) {
                valido = true;
            }
        } else if (soma <=99) {

            int decimal = soma/10;
            int unidade = soma%10;

            if(meuArrayDeCodigo[20] == decimal && meuArrayDeCodigo[21] == unidade){
                valido = true;
            }
        } //else if (soma > 99){}

        return valido;
    }

    public static boolean CodigoDeBarrasValidatorV3(int[] codigo22Digitos){
        if(codigo22Digitos.length != 22){
            System.err.println("* Tamanho deve ser igual a 22!");
        }
        int soma = 0;
        for (int i = 0; i < 20; i++){
            soma = soma + codigo22Digitos[i];
        }

        //MOD10 - se 1, fica 1. Se 23 fica 3. Se 227, fica 7
        int unidade = soma % 10;

        //Divisao/10 para pegar o decimal e o MOD10 eh pra resolver o > 99
        int decimal = (soma/10) % 10;
        System.out.println(" -> Digito verificador calculado: " + decimal + unidade);

        int[] digitoCalculado = new int[]{decimal, unidade};

        //Obtem os ultimos digitos

        int[] digitosVerificadores = new int[]{codigo22Digitos[20], codigo22Digitos[21]};

        //Verifica se eh valido
        boolean valido = digitoCalculado[0] == digitosVerificadores[0] && digitoCalculado[1] == digitosVerificadores[1];

        return valido;
    }
}
