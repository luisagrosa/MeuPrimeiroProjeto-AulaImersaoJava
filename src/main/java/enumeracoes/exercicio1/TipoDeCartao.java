package enumeracoes.exercicio1;

public enum TipoDeCartao {
    STANDARD(0.0305F), GOLD(0.0305F), PREMIUM(0.0295F), BLACK(0.0198F);

    private float taxaJuros;

    TipoDeCartao(float taxaJuros){
        this.taxaJuros = taxaJuros;
    }

    public float getTaxaJuros(){
        return taxaJuros;
    }

    public static TipoDeCartao obtemTipoAPartirDaTaxa(float taxa){
        for(TipoDeCartao tipo : TipoDeCartao.values()){
            if(tipo.getTaxaJuros() == taxa) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo nao encontrado");
    }
}