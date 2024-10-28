package Atividade1;

public class PrimeiraThread implements Runnable{

    private String nome;

    public PrimeiraThread(String nome){
        this.nome = nome;
    }

    public void run(){

        System.out.println("Minha primeira Thread: " + nome);
    }

}