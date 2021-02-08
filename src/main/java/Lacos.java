import java.util.Scanner;

public class Lacos {

    public static void main(String[] args){

        //imprimirSomaAte1000();
        //imprimirMultiplosDeTres();
        //imprimirFatoriais();
        testandoReturn();

        /*
        int contador = 0;

        while(contador <=10){
            contador = contador +1;
            System.out.println(contador);

        }

        //for(;;){} & while(true){} sao lacos infinitos (ruim)
        for(int counter = 0; counter < 10 ; counter = counter+1){
            System.out.println(counter);
        }

        int menu= 0;
        do {
            System.out.println("Informe o menu: 1 - Adm,");
            menu = new Scanner(System.in).nextInt();
        } while (menu != 1);


        int contagem = 150;
        while(contagem <= 350){
            System.out.print(contagem);
            contagem = contagem + 1;
        }

        System.out.println("\n");


        for(int umNumeroBom = 150; umNumeroBom <=350; umNumeroBom = umNumeroBom + 1){
            System.out.print(umNumeroBom);
        }

        System.out.println("\n");

        int numberGood = 150;
        do{
            System.out.print(numberGood);
            numberGood = numberGood + 1;
        }while (numberGood <=350);

*/

        }


    public static  void imprimirSomaAte1000(){
        int somaAgoraSim = 0;
        for(int soma = 0; soma < 1000; soma = soma +1){
            somaAgoraSim = somaAgoraSim + soma;
            System.out.println(somaAgoraSim);
        }

    }


    public static void imprimirMultiplosDeTres(){
        for(int i = 3; i <= 100; i=i+1 ) {
            if (i % 3 == 0) {
                System.out.printf("Multiplo de 3: %d\n", i);
            }
        }

    }

    public static void imprimirFatoriais(){
        //imprima os fatoriais de 1 a 10 utilizando for ou while
        System.out.println("imprimirFatoriais1a10: ");
        int fatorial= 0;
        for (int contador = 0; contador <= 10; contador++){

            if(contador <= 1){
                fatorial = 1;
            }else{
                fatorial = contador * fatorial;
            }
            System.out.println(contador + "!: " + fatorial);

        }
        System.out.println("----------------------");


    }

    public static int testandoReturn(){
        //testei sendo 'public static void' e nao funciona: nao pode retornar
        int testeNumero = 1;
        return testeNumero;
    }


    }

