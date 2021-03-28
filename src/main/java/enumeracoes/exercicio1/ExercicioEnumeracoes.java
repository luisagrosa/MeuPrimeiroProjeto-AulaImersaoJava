package enumeracoes.exercicio1;

import java.math.BigDecimal;

public class ExercicioEnumeracoes {

    public static void main(String[] args) {

        ModalidadeCredito cartao1 = new ModalidadeCredito();
        System.out.println(cartao1.retornarTipoCartao(4000));

        System.out.println(TipoDeCartao.BLACK.getTaxaJuros());
        System.out.println(TipoDeCartao.PREMIUM.getTaxaJuros());

        System.out.println(TipoDeCartao.obtemTipoAPartirDaTaxa(0.0295F));
        System.out.println(TipoDeCartao.obtemTipoAPartirDaTaxa(0.0305F));


    }
}
