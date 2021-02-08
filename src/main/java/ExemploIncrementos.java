import java.util.Scanner;

public class ExemploIncrementos {

    public static void main(String[] args) {

        int meuNumero = 1;
        System.out.println(meuNumero);
        System.out.println(++meuNumero); //incrementa antes de imprimir. JA imprime incrementado

        int meuOutroNumero = 1;
        System.out.println(meuOutroNumero);
        System.out.println(meuOutroNumero++); //incrementa depois de imprimir. Entao imprime 1 , e nao 2
        System.out.println(meuOutroNumero);

    }
}
