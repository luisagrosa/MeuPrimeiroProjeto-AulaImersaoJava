package excecoes;

public class PosicaoInvalidaException extends Exception{

    public PosicaoInvalidaException(String mensagem){
        super(mensagem);//passa a mensagem pelo construtor da classe pai (Excpetion)
    }
}
