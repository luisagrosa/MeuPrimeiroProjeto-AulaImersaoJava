package colecoes.exemplocomparator;

public class Despesa implements Comparable<Despesa> { //contrato de comparabilidade

    private String descricao;
    private Float valor;

    public Despesa(String descricao, Float valor) {
        //palavra THIS esta semppre se referindo a um atributo!!! O que vem dentro do parentese no construtor sao parametros
        this.descricao = descricao;
        this.valor = valor;
    }
        public String getDescricaoCompleta(){
            return String.format("%s: R$ %f", this.descricao, this.valor);
        }

        public int compareTo(Despesa outraDespesa){
            System.out.printf("Estou comparando %s com %s\n", this.descricao, outraDespesa.descricao);
            return this.descricao.compareToIgnoreCase(outraDespesa.descricao);
        }

    public Float getValor() {
        return valor;
    }
}

