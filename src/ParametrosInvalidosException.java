public class ParametrosInvalidosException extends Contador{

    public ParametrosInvalidosException(int numeroUm, int numeroDois) {
        super(numeroUm, numeroDois);


    }

    @Override
    public void contar() {
        try{
            int interacao = getNumeroDois() - getNumeroUm();

            for (int i = 1; i <=interacao ; i++) {

                System.out.println("Imprimindo numero: " + i);

            }

        }catch (Exception e){

            System.out.println("NumeroDois tem que ser maior que numeroUm ");
        }
    }
}
