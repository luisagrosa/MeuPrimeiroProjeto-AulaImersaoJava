package colecoes.exercicioordenacao2;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Float custoAquisicao;
    private Float valorVenda;

    public Produto(String name, Float custo, Float valor){
        this.nome = name;
        this.custoAquisicao = custo;
        this.valorVenda = valor;
    }

    public String getNome() {
        return nome;
    }

    public Float getCustoAquisicao() {
        return custoAquisicao;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public String getDescricao(){
        return String.format("Nome do Produto: %s - custou %f e estamos vendendo por %f. Lucro foi: %f",
                this.nome,  this.custoAquisicao, this.valorVenda,this.getLucro());
    }

    public int compareTo(Produto p1){
     // nma situacao adversa pode ser que algum deles esteja null..
        // se isso acontecer a gente nao quer deixar rodar a linha 17 de jeito nenhum, pq quebra legal
        if (this.nome == null){
            return 1;
        }
        if(p1 == null || p1.nome == null){
            return -1;
        }
        return this.nome.compareTo(p1.nome);
    }

    public Float getLucro(){
        if(valorVenda == null) {
            return 0F;
        }
        if(custoAquisicao == null) {
            return valorVenda;
        }
        return valorVenda - custoAquisicao;
    }
}


