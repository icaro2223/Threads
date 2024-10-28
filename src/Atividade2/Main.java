package Atividade2;

import Atividade3.Impares;
import Atividade3.Pares;

public class Main {
    public static void main(String[] args){



        NumerosPares par = new NumerosPares(1, 30);
        Thread t1 = new Thread(par);

        NumerosImpares impar = new NumerosImpares(1, 30);
        Thread t2 = new Thread(impar);

        t2.start();
        t1.start();
    }
}
