import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ExemplosStrings {

    public static void main(String[] args) {
        //exercicioStringSplit();
        //exercicioStringSubstring();
        //exercicioStringtoLowerCaseouUpperCase();
        //exercicioCompareTo();
        //exercicioStringtoLowerCaseouUpperCaseDoProf();
        //exercicioIndexOf();
        //algunsOutrosMetods();
        //desafioTwitter();
        //imprimeInformacaoUsandoBuilder("245");
        //testandoBufferEBuilder();
        exercicioStringBuffer();
    }

    public static void exercicioStringSplit() {
        System.out.println("Escreva tua frase: ");
        String texto = new Scanner(System.in).nextLine();
        String[] palavrasDoTexto = texto.split(" ");
        for (String cadaPalavra : palavrasDoTexto) {
            System.out.println(cadaPalavra);
        }

    }

    public static void exercicioStringSubstring() {
        System.out.println("Escreva tua frase: ");
        String texto = new Scanner(System.in).nextLine();
        if (texto.length() <= 13) {
            System.out.println(texto);
        } else {
            System.out.println(texto.substring(0, 14));
        }

    }

    public static void exercicioStringtoLowerCaseouUpperCase() {
        System.out.println("Escreve tua frase, parceira: ");
        String texto = new Scanner(System.in).nextLine();
        String[] palavrasDeTexto = texto.split(" ");
        System.out.print("Tua frase em maiusculas: " + palavrasDeTexto[0].toUpperCase() + " ");
        for (int i = 1; i < palavrasDeTexto.length; ++i) {
            System.out.print(palavrasDeTexto[i].toLowerCase() + " ");
        }

    }

    public static void exercicioStringtoLowerCaseouUpperCaseDoProf() {
        System.out.println("Sua frase, lindinha: ");
        String entrada = new Scanner(System.in).nextLine();
        String[] palavras = entrada.split(" ");

        boolean ehAPrimeira = true;
        for (String palavra : palavras) {
            if (ehAPrimeira) {
                System.out.print(palavra.toUpperCase() + " ");
                ehAPrimeira = false;
            } else {
                System.out.print(palavra.toLowerCase() + " ");
            }

        }
    }

    public static void exercicioCompareTo() {
        System.out.println("Informe seu email: ");
        String email = new Scanner(System.in).nextLine();
        email = email.trim();
        if (email.isEmpty()) {
            System.out.println("Voce precisa informar seu email");
        }
        if (email.compareTo("seuemail@mail.com") == 0) {
            System.out.printf("O email informado %s esta coreto", email);
        } else {
            System.out.println("Sinto muito, o email nao esta correto.");
        }
    }

    public static void exercicioIndexOf() {
        System.out.println("Tua frase: ");
        String site = new Scanner(System.in).nextLine();
        int posicaoDaVirgula = site.indexOf(',');
        System.out.println(site.substring(0, posicaoDaVirgula));

    }

    public static void desafioTwitter() {
        System.out.println("Teu texto para ser truncado aqui");
        String texto = new Scanner(System.in).nextLine();
        if (texto.length() > 140) {
            System.out.println(texto.substring(0, 139) + "...");
        } else {
            System.out.println(texto);
        }
    }


    public static void algunsOutrosMetods() {

        //Testando alguns outros metodos
        System.out.println("Dog".compareTo("DOG") == 0);
        System.out.println("Dog".compareToIgnoreCase("DOG") == 0);
        System.out.println("Dog".equals("DOg"));

        String senha = "    se   nha      ";
        System.out.println(senha.trim());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("  ".isBlank());

        //Tipos primitivos: comparados com ==, ele compara o valor/conteudo
        //Strings comparadas com ==, compara o lugar da memoria, nao o conteduo. Se der igual, com certeza eh igual. Mas pode ser igual e dar diferente.
        //o == pra String compara o lugar da memoria


        String ditado = "Cao que ladra nao morde";
        String ditado2 = ditado.replaceAll("nao", "");
        System.out.println(ditado2);//TODO eu amei esse troco de to do !!! Eh como se fosse grifar

        //startswith ends with
        boolean ternubaEmPontoCom = "seusite.com".endsWith(".com");
        System.out.println(ternubaEmPontoCom);

        //format
        int quantidade = 125;
        String informacao = String.format("Total: %d tomates", quantidade);
        String informacao2 = "Total: " + quantidade + " tomates";
        // a concatenao gera mais string pools. Consome mais memoria
        System.out.println(informacao);
        System.out.println(informacao2);

        //valueOf
        imprimeInformacao(String.valueOf(quantidade));

        //charAt
        char primeiraLetra = "Cao".charAt(0);
        System.out.println(primeiraLetra);

        //getBytes()
        byte[] bytesDoCao = "Cao".getBytes();
        System.out.println(bytesDoCao);
        String aVoltaDaString = new String(bytesDoCao);
        System.out.println(aVoltaDaString);

    }

    public static void imprimeInformacao(String descricao) {
        System.out.println(String.format("Total: %s itens", descricao));
    }

    public static void imprimeInformacaoUsandoBuilder(String descricao) {
        StringBuilder builder = new StringBuilder();
        builder.append("Total: ");
        builder.append(descricao);
        builder.append(" itens.");
        System.out.println(builder);
    }

    public static void testandoBufferEBuilder(){
        String inicial ="";
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Hello ");
        buffer.append("My ");
        buffer.append("Name");
        System.out.println(buffer);

    }

    public static void exercicioStringBuffer(){

        StringBuffer buffer = new StringBuffer();
        String inicio = "Eu fui na feira e comprei ...";
        buffer.append(inicio);
        System.out.println(inicio);
        boolean UsuarioQUerSair = false;

        do{

            String texto = new Scanner(System.in).nextLine();
            if (texto.equals("sair")){
                UsuarioQUerSair = true;
                continue;
            }
            buffer.append(texto);
            buffer.append(", ");
            System.out.println(buffer);

        } while(UsuarioQUerSair == false);
    }


}
