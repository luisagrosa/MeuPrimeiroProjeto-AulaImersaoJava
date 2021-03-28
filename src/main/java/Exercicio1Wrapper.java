public class Exercicio1Wrapper {

    public static void main(String[] args){


        Character letraC = converteEmMinuscula('C');
        System.out.println(letraC);
        Character letraD = converteEmMinuscula(Character.valueOf('D'));
        System.out.println(letraD);

        String letraE = converteEmMinuscula('E').toString();
        System.out.println(letraE);

    }

    public static Character converteEmMinuscula(Character letra){
        //Crie uma função que recebe uma classe Character (pressupondo que seja uma letra
        //maiúscula) e converta a mesma para minúscula.
        //Não utilize recursos da String. Nao vale String.valueOf.toLowerCase
        Character emLetraMinuscula = Character.toLowerCase(letra);
        return emLetraMinuscula;
    }


}
