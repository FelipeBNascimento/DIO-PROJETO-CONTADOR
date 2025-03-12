public class Contador {

    private int numeroUm;
    private int numeroDois;

    public Contador(int numeroUm, int numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public int getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }

    public int getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(int numeroDois) {
        this.numeroDois = numeroDois;
    }

    public void contar(){

        int interacao = getNumeroDois() - getNumeroUm();

        if(interacao > 0) {
            for (int i = 1; i <=interacao ; i++) {
                System.out.println("Imprimindo numero: " + i);}
            }else{
                System.out.println("numeroDois menor que numeroUm");
            }
        }
    }



