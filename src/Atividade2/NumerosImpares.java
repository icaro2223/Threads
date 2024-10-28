package Atividade2;

import java.lang.Exception;
public class NumerosImpares implements Runnable{

    public int numeroInicio;
    public int numeroFim;

    public NumerosImpares(int numeroinicio, int numeroFim){
        this.numeroInicio = numeroinicio;
        this.numeroFim = numeroFim;
    }

    @Override
    public void run(){

        try{
            for(int i = numeroInicio; i<= numeroFim; i++){
                if(i % 2 != 0){
                    System.out.println("Numeros impares: " + i);
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
