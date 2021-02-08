import java.util.Scanner;

public class ExemplosComandos {

    public static void main(String[] args){

        int numero = 7;
        boolean ehPar = numero%2 == 0;
        if(ehPar) {
            System.out.println("Par");
        }else {

            System.out.println("Impar");
        }

        String nome = "vitoria";
        boolean ehLegal = nome != "Anelisi";

        if(ehLegal) {

            System.out.printf("%s eh muito legal!\n", nome);
        }


        System.out.println("Informe um numero:");
        int number=  new Scanner(System.in).nextInt();
        System.out.printf("Seu numero: %d\n", number);

        int op = 2;
        System.out.print("valor de op eh: "+op);

        switch(op){

            case 1:
                System.out.println("case 1: op="+op);
                break;
            case 2:
                System.out.println("case 2: op="+op);
                break;
            case 3:
                System.out.println("case 3: op="+op);
                break;
        }
        byte ddd = 56;
        //byte ddd = 55;
        switch(ddd){
            case 51:
                System.out.println("O 51 eh do Rio Grande do Sul");
                break;
            case 53:
                System.out.println("o DDD 53 eh do Amazonas");
                break;
            case 56:
                System.out.println("o DD eh de Sergipe");
                break;
            default:
                System.out.println("Regiao Desconhecida");
        }

        System.out.println("QUal foi a nota do aluno? ");
        int nota = new Scanner(System.in).nextInt();

        if(nota >= 7){

            System.out.println("Parabens, voce passou de ano!");
        } else {

            System.out.println("Triste demais, voce nao passou! Vai ter que fazer de novo");
        }
        Scanner minhaScanner = new Scanner(System.in);
        System.out.println("De sua nota ao produto legal, de 1 a 5: ");
        byte notaProduto = minhaScanner.nextByte();

        switch(notaProduto) {
            case 1:
                System.out.println("Pessimo");
                break;
            case 5:
                System.out.println("Excelente");
            default:
                System.out.println("Notas 2,3,4: uma mediana medrioce de bosta");
        }
    }
}
