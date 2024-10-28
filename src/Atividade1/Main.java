package Atividade1;

public class Main {

    public static void main(String[] args){

        PrimeiraThread thread1 = new PrimeiraThread("thread do icaro");
        Thread t1 = new Thread(thread1);
        t1.start();
    }
}