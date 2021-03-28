package enumeracoes;

public class ProgramaEnums {

    public static  void main (String[] args){
        System.out.println(TipoDeOpcao.SIM);

        System.out.println(TipoMovimento.CREDITO.getSigla());
        System.out.println(TipoMovimento.CREDITO.getValorTarifa());

        System.out.println(TipoMovimento.obotemAPartirDaTarifa(5.0F));

    }
}
