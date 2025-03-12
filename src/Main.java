import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int numeroDois = scanner.nextInt();

        Contador contadorUm = new Contador(numeroUm, numeroDois);

        contadorUm.contar();

        ParametrosInvalidosException contadorComExcessao = new ParametrosInvalidosException(numeroUm, numeroDois);

        //contadorComExcessao.contar();


    }
}