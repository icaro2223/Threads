package Atividade2;

import java.lang.Exception;
public class NumerosPares implements Runnable{

    public int numeroInicio;
    public int numeroFim;


    public NumerosPares(int numeroInicio, int numeroFim){
        this.numeroInicio = numeroInicio;
        this.numeroFim = numeroFim;
    }

    @Override
    public void run() {
        try {
            for (int i = numeroInicio; i <= numeroFim; i++) {
                if (i % 2 == 0) {
                    System.out.println("Numeros pares: " + i);
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


}
