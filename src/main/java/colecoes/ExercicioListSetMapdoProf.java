package colecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioListSetMapdoProf {

    public static void main (String[] args) throws IOException {

        //List<String> paises = new ArrayList<>();
        //com java.nio
        List<String> paises = Files.readAllLines(Path.of("src/main/resources/campeoes.txt"));

        Map<String,Integer> quantidadeTitulos = new HashMap<>();

        for(String linha : paises){
            System.out.println(linha);
            //String pais = linha.split("- ");
        }
    }
}
