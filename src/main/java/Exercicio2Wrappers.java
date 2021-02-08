public class Exercicio2Wrappers {

    public static void main (String [] args){

        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        formaLuDeFazer(numeros);
        System.out.println("\nForma 1: ");
        forma1DeFazer(numeros);
        System.out.println("\n\nForma 2: ");
        forma2DeFazer(numeros);
        System.out.println("\n\nForma 3: ");
        forma3DeFazer(numeros);

    }

    private static void forma1DeFazer(int[] numeros){

        for(int i: numeros){
            System.out.print(Character.toChars(i));
        }
    }

    private static void forma2DeFazer(int[] numeros){
        for(int i : numeros){
            char letra = (char) i;
            System.out.print(letra);
        }
    }

    private static void forma3DeFazer(int[] numeros){
        for(int i: numeros){
            System.out.print(Character.toString(i));
        }
    }

    private static void formaLuDeFazer(int[] numeros){

        String str = null;
        for (int i : numeros) {
            str = Character.toString((char) i);
            System.out.print(str);
        }
    }


}
