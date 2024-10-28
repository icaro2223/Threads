package Atividade4;

public class Main {
    public static void main(String[] args){

        Object sinc = new Object();

        Contador contador = new Contador(0, 100000, sinc);

        Thread t1 = new Thread(contador, "t1");
        Thread t2 = new Thread(contador, "t2");
        Thread t3 = new Thread(contador, "t3");
        Thread t4 = new Thread(contador, "t4");
        Thread t5 = new Thread(contador, "t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Esperar todas as threads terminarem usando join
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Imprimir o valor final do contador
        System.out.println("Valor final do contador: " + contador.getContador());
    }
}
