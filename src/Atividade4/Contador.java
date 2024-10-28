package Atividade4;

public class Contador implements Runnable{

    public int contador;

    public int incrementa;

    private final Object sinc;


    public Contador(int num, int incrementa,Object sinc){
        this.contador = num;
        this.sinc = sinc;
        this.incrementa = incrementa;
    }

    public void contador() {
        synchronized (sinc) {
            for (int i = 0; i < incrementa; i++) {
                contador++;
                System.out.println("Contador: " + contador);

            }
            System.out.println("Thred " + getNomeThread() + " Terminou o processo");
        }
    }

    @Override
    public void run() {
        contador();
    }

    public int getContador() {
        return contador;
    }

    public String getNomeThread() {
        return Thread.currentThread().getName();
    }
}
