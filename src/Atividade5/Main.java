package Atividade5;

public class Main {

    public static void main(String[] args) {

        Object sinc = new Object();

        Produtor icaro = new Produtor("Icaro", sinc);

        Consumidor leandro = new Consumidor("Leandro", icaro, sinc);

        Thread t1 = new Thread(icaro);
        Thread t2 = new Thread(leandro);

        t1.start();
        t2.start();
    }
}
