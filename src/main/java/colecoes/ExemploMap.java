package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main (String[] args) {
        HashMap<String,String> capitais = new HashMap<String,String>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC","Floripa");
        capitais.put("RJ", "Rio de Janeiro");
        System.out.println(capitais.get("RS"));

        System.out.println("\nImprimindo so as chaves");
        for (String c : capitais.keySet()){
            System.out.println(c);
        }


        System.out.println("\nImprimindo so os valores");
        for (String v : capitais.values()){
            System.out.println(v);
        }

        System.out.println("\nImprimindo os pares: ");
        for (Map.Entry<String,String> entryCidades : capitais.entrySet()){
            System.out.printf(entryCidades.getKey() + entryCidades.getValue());
        }
    }
}
