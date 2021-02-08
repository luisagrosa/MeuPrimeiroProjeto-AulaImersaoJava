public class ExemplosArrays {

    public static void main(String[] args){

        int[] anos = new int[2];
        anos[0] = 25;
        anos[1] = 26;
        //System.out.println(anos[1]);

        char[] tiposDeConta = new char[]{'C', 'D'};

        for (int i = 0; i < 2; i++){
            //System.out.println(tiposDeConta[i]);
        }

        //System.out.printf("O menor eh: %d" , retornaOMenorDeUmArray());
    }

    public static int retornaOMenorDeUmArray() {


        int[] numeros = new int[]{88,7,0,-1,45,3,92,-9,30000000,12,23567};
        int menor = 0;
        for (int i = 0; i < numeros.length; i++){
            if(i == 0){
                menor = numeros[i];
                continue;
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            System.out.println(menor);

        }
        return menor;
    }


}
