import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
    /*
    -
     */
    public static void main(String[] args) {

        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");

        System.out.println("Listagem: ");
        for (String lang : linguagens) {
            System.out.println(lang);
        }

        Collections.sort(linguagens);

        System.out.println("Listagem ordenada: ");
        for (String lang : linguagens) {
            System.out.println(lang);
        }

        System.out.printf("Contem o PHP? %s", linguagens.contains("PHP"));
        System.out.printf("Contem o Python? %s", linguagens.contains("Python"));

        System.out.printf("\n Primeiro elmento: %s", linguagens.get(0));

        linguagens.remove("Java");
    }

}
