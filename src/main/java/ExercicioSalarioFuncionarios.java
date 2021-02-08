import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

//mostrar a lista de pessoas da empresa e seu salário com benefícios.
//O resultado esperado para cada funcionário é: nome completo (nome + sobrenome) e o valor da soma do do salário + benefícios.
public class ExercicioSalarioFuncionarios {

    public static void main(String[] args) throws IOException{
       //Scanner(Path source) -- Constructs a new Scanner that produces values scanned from the specified file.
        Scanner sc = new Scanner(Path.of("/home/greyce/IdeaProjects/MeuPrimeiroProjeto/src/main/resources/pessoas.csv"));

        boolean temNovaLinha = sc.hasNext(); // serve pra saber se ha nova linha
        String linha = sc.nextLine(); // troca e retorna a nova linha

        while (temNovaLinha == true) {
            linha = sc.nextLine();
            String [] valoresDaLinha = linha.split(",");

            int posicaoDoPonto = valoresDaLinha[3].indexOf(".");
            String SalarioSemPonto = valoresDaLinha[3].substring(0, posicaoDoPonto);
            int Salario = Integer.parseInt(SalarioSemPonto);
            int posicaoDoPonto2 = valoresDaLinha[4].indexOf(".");
            String BeneficioSemPonto = valoresDaLinha[4].substring(0, posicaoDoPonto2);
            int Beneficio = Integer.parseInt(BeneficioSemPonto);
            int somaSalarioBeneficio = Salario + Beneficio;

            System.out.printf(valoresDaLinha[1] + " " + valoresDaLinha[2] + "recebe o total de: " + somaSalarioBeneficio + "\n");
        }

    }
}
