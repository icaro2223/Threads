package Atividade3;

public class Pares implements Runnable{


    public int numeroInicio;
    public int numeroFim;

    public final Object sincronismo;


    public Pares(int numeroInicio, int numeroFim, Object sincronismo){
        this.numeroInicio = numeroInicio;
        this.numeroFim = numeroFim;
        this.sincronismo = sincronismo;
    }

    @Override
    public void run() {
        synchronized (sincronismo) {
            try {
                for (int i = numeroInicio; i <= numeroFim; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Numeros pares: " + i);
                        Thread.sleep(1000);
                        sincronismo.notify();
                        sincronismo.wait();
                    }

                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            //para nao dar problema de deadlock
            sincronismo.notify();
        }

    }




}
