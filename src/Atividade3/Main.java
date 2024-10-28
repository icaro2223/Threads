package Atividade3;

import Atividade3.Impares;
import Atividade3.Pares;

public class Main {
    public static void main(String[] args){

        Object sinc = new Object();

        Pares par = new Pares(1, 30, sinc);
        Thread t1 = new Thread(par);

        Impares impar = new Impares(1, 30, sinc);
        Thread t2 = new Thread(impar);

        t2.start();
        t1.start();
    }
}
