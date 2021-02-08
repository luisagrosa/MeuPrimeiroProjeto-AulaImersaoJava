public class ExerciciosTiposPrimitivos {

    public static void main(String[] args) {
        byte idade = 25;
        short ano = 2021;
        boolean chovendo = false;
        float Pi = 3.141592653589793F;
        char primeiraletra = 'L';
        float cambiodolar = (float)5.5;
        long popbrasil = 209300000;
        long popmundo = 7700000000L;

        System.out.printf("Meu nome eh Lu, tenho %d anos. Presentemente estamos no ano %d 2021 e a primeira letra do meu nome eh %s. \n", idade, ano, primeiraletra);
        System.out.println(chovendo);
        System.out.printf("Valor de PI: %.8f\n", Pi); //.8f tu diz pra formatacao que quer 8 casas decimais

        int vendas = 1023;
        boolean pago = true;
        char pagamento = 'C';

        //Conteudo de um arquivo PDF
        byte[] conteudoArquivoPdf; // =n new char[]{0, '2'}
        long CNPJ = 201234567890L;
        float preco = 16.80F;
        String codigo = "4891312478912091280941";

    }
}
