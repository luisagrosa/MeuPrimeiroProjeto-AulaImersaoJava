package enumeracoes;

public enum TipoMovimento {
    DEBITO(1.5F, "D"),
    CREDITO(6.5F, "C"),
    SAQUE(3.0F, "S"),
    TED(5F, "T"); // precisa nesse caso o ; pra dizer que termina ali o enum e comeca outra coisa (atributos/metodos

    private float valorTarifa;
    private String sigla;

    //Construtor sem visibilidade pra fora. So aqui dentro
    TipoMovimento(float valorTarifa, String sigla){
        this.valorTarifa = valorTarifa;
        this.sigla = sigla;
    }

    public float getValorTarifa(){
        return valorTarifa;
    }

    public String getSigla(){
        return sigla;
    }

    public float getTarifa(){
        return valorTarifa;
    }

    //Metodo utlitario para buscar pela sigla

    public static TipoMovimento obtemAPartirdaSigla(String sigla){
        for(TipoMovimento tipo: TipoMovimento.values()) {
            if(tipo.getSigla().equalsIgnoreCase(sigla)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo nao encontrado");
    }


    public static TipoMovimento obotemAPartirDaTarifa(float tarifa){
        for (TipoMovimento tipo : TipoMovimento.values()) {
            if(tipo.getTarifa() == tarifa) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo nao encontrado");
    }

}
