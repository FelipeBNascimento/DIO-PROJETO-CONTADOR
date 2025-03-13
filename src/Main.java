import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Fazendo a excessão para o usaurio
        try{
            System.out.println("********************\n Rodando a primeira parte do programa com tratamento de erro");
            // Aqui está fazendo as perguntas ao usuario para informar os numeros e armazenado nas variáveis
            System.out.println("Informe o primeiro numero: ");
            int numeroUm = scanner.nextInt();

            System.out.println("Informe o segundo numero: ");
            int numeroDois = scanner.nextInt();

            //criando um objeto contador com os parametros específicos
            ParametrosInvalidosException contadorComExcessao = new ParametrosInvalidosException(numeroUm, numeroDois);

            // chamando o metodo para fazer o loop com laço for
            contadorComExcessao.contar();
           }

        //tratando o erro caso o usuario informa algum caracter que não seja numero
        catch (InputMismatchException e){

            System.out.println("Os dados precisam ser numeros inteiros");
        }


        System.out.println("*****************\n Rodando a segunda parte do programa sem o tratamento de erro");
        System.out.println("Informe o primeiro numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numeroDois = scanner.nextInt();

        //criando um objeto contador com os parametros específicos
        Contador contadorUm = new Contador(numeroUm, numeroDois);

        // chamando o metodo para fazer o loop com laço for
       contadorUm.contar();

       /*a Classe Contador foi cirado um objeto contadorUm porém pode acontecer um erro caso o usuário
       informe um caracter diferente de um numero inteiro.
        */

    }


}