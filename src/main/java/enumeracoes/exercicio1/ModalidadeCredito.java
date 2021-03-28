package enumeracoes.exercicio1;

import java.math.BigDecimal;

public class ModalidadeCredito {

    public TipoDeCartao retornarTipoCartao (float renda) { //pra tipos monetarios bom usar BigDecimal
        if(renda <1000) {
          return TipoDeCartao.STANDARD;
       } else if (renda <3000) {
          return TipoDeCartao.GOLD;
        } else if (renda <10000) {
            return TipoDeCartao.PREMIUM;
        } else if (renda >= 10000) {
           return TipoDeCartao.BLACK;
       } else {
            return TipoDeCartao.STANDARD;
        }

    }
}
