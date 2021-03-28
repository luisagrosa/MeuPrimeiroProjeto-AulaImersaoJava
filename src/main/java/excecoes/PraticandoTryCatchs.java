/*
package excecoes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;


    //1 - Trate as exceções a seguir:
    public class PraticandoTryCatchs {

        //Não altere esse método, somente dentro dos métodos internos
        public static void main(String args[]) {
            excecoesNumericas();
            nullPointerException();
            indexOfBounds();
            arquivoInexistente();
            erroDeConversao();
            argumentoObrigatorio();
            multiplasExcecoes();
        }

        private static void erroDeConversao() {
            int num = 0;
            try {
                num = Integer.parseInt("zero");
            }
            catch (NumberFormatException)

            System.out.println(num);
        }

        private static void arquivoInexistente() {
            File file = new File("E://arquivo.txt");
            //FileReader também é auto-closable
            // pode ser usado o try(), que se chama try-with-resources.
            try {
                FileReader fr = new FileReader(file);
            } catch (IOException e) {
                System.err.printf("Arquivo nao encontrado. Detalhes: %s", e.getMessage());

            }
        }

        private static void indexOfBounds() {
            String e = "Imersao Java";
            char f = e.charAt(29);
            System.out.println(e);
        }

        private static void nullPointerException() {
            String d = null;
            System.out.println(d.charAt(0));
        }

        private static void excecoesNumericas() {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println ("Resultado = " + c);
        }

        private static void argumentoObrigatorio(){
            metodoDisparaIllegal();
        }

        private static void multiplasExcecoes() {
            //trate com vários catchs separados

            try {
            metodoDisparaSql();
            metodoDisparaIOException();
            }
            catch (SQLDataException e){
            }
            catch(IOException e){
            }

        }

        private static void multiplasExcecoesMultiCatch() {
            //trate com apenas um multi-catch
            try {
                metodoDisparaSql();
                metodoDisparaIOException();
            }
            catch(SQLDataException j, IOException e){

            }
        }

        //Não altere esse método, somente quem o chama
        private static void metodoDisparaIllegal() {
            throw new IllegalArgumentException();
        }

        //Não altere esse método, somente quem o chama
        private static void metodoDisparaIOException() throws IOException {
            throw new IOException();
        }

        //Não altere esse método, somente quem o chama
        private static void metodoDisparaSql() throws SQLDataException {
            throw new SQLDataException();
        }
    }
}
*/