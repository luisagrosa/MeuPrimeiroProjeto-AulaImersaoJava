public class Pessoa {
    private String nome;

    public void setNome(String novoNome) {
        if (novoNome.length() < 3) {
            System.err.println("nao eh possivel alterar nome, muito pequeno");
        } else {
            nome = novoNome;
        }
    }

        public String getNome () {
            return nome;
        }
    }

