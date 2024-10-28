package Atividade5;
import java.util.Queue;
import java.util.LinkedList;

public class Consumidor implements Runnable {

    Object sinc = new Object();
    String nome;

    Produtor produtor;

    public Consumidor(String nome, Produtor produtor, Object sinc) {
        this.nome = nome;
        this.produtor = produtor;
        this.sinc = sinc;
    }

    @Override
    public void run() {
        synchronized (sinc) {
            try {
                while (produtor.getProdutos().isEmpty()) {
                    System.out.println("O estoque está vazio!");
                    System.out.println("Esperando produtos...");
                    Thread.sleep(1000);
                    sinc.wait();
                }
                if( produtor.getProdutos() != null) {
                    System.out.println(nome + " Consumiu " + produtor.getProdutos().poll().getNomeProduto());
                }
                System.out.println("\n");

                System.out.println("produtos restantes após as compras:");
                for (Produto p : produtor.getProdutos()) {
                    System.out.println(p.getNomeProduto());
                }
                sinc.notify();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
