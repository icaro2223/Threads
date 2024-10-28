package Atividade6;
import Atividade5.Produtor;
import Atividade5.Consumidor;
import Atividade5.Produto;


public class Main {
    public static void main(String[] args) {
        Object sinc = new Object();

        Produtor produtor1 = new Produtor("Icaro", sinc);
        Consumidor consumidor1 = new Consumidor("kauan", produtor1, sinc);

        Produtor produtor2 = new Produtor("joao", sinc);
        Consumidor consumidor2 = new Consumidor("Leandro", produtor2, sinc);

        Thread t1 = new Thread(produtor1);
        Thread t2 = new Thread(consumidor1);
        Thread t3 = new Thread(produtor2);
        Thread t4 = new Thread(consumidor2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
