public class InformacoesSistema {

    //Atalho digite psvm
    public static void main(String[] args) {

        System.out.println("Processadores disponiveis: ");
        //Atalho digite sout
        System.out.println(Runtime.getRuntime().availableProcessors());

        // se for um digito = %d, se for um texto/string = &s, se for um numero com virgula = %f
        System.out.printf("Processadores Disponiveis: %s  . Memoria maxima: %s .\n", Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().maxMemory());

        System.out.printf("%d MB eh a memoria maxima que pode ser utilizada JVM (HEAP). \n", Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.printf("%d MB eh o que estou usando pela JVM (heap) \n", Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(96/4);
    }
}
