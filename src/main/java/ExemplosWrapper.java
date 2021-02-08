import javax.sound.sampled.AudioFormat;

public class ExemplosWrapper {

    public static void main(String[] args) {
        String a = "aa"; // instanciado com conteudo
        String b = ""; // Vazio, foi instanciado, mas nao tem conteudo
        String c; // Null (implicto) - nao foi instanciada
        String d = null; //null (explciito) - nao foi instanciada

        float salario = 0; // primitivo nunca fica nulo!!!
        Float Salario = null; // eh por e fireferencia, pode ficar null!

    }

    private static void soComPrimitivos() {
        int[] lista = new int[1];
        lista[0] = 25;
        int primeiroNumero = lista[0];
    }


    private static void soComWrapper() {
        Integer[] lista = new Integer[1];
        lista[0] = Integer.valueOf(25);
        Integer primeiroNumero = lista[0];
    }


}
