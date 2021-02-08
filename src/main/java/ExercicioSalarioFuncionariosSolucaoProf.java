import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ExercicioSalarioFuncionariosSolucaoProf {

    public static void main(String[] args) throws IOException {

        //Le arquivo
        Scanner scanner = new Scanner(Path.of("/home/greyce/IdeaProjects/MeuPrimeiroProjeto/src/main/resources/pessoas.csv"));
         System.out.println("Ignorado: " + scanner.nextLine());
        //chamando o next line, passa o ponteiro
        System.out.printf("\n%-20s \t %s \n\n", "Nome", "Salario+Beneficios");

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();

            String nome = obtemNomeCompleto(linha);
            Float soma = obtemSomaSalarioBeneficios(linha);

            System.out.printf("%-20s \t R$ %.2f \n", nome, soma);
        }

    }

      public static String obtemNomeCompleto(String linha){
            String[] partes = linha.split(",");
            return new StringBuffer()
                    .append(partes[1])
                    .append(" ")
                    .append(partes[2])
                    .toString();
      }

      public static float obtemSomaSalarioBeneficios(String linha){
          String[] partes = linha.split(",");
          return Float.parseFloat(partes[3]) + Float.parseFloat(partes[4]);

      }

}
