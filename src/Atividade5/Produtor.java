package Atividade5;
import java.util.Queue;
import java.util.LinkedList;

public class Produtor implements Runnable{

    Object sinc = new Object();
    String nome;
    Queue<Produto> produtos = new LinkedList<>();

    public Produtor(String nome, Object sinc){
        this.nome = nome;
        this.sinc = sinc;
    }

    @Override
    public void run() {
        synchronized (sinc){
            try{
                Produto produto = new Produto("Shampoo", 15.0);
                produtos.add(produto);
                Produto produto2 = new Produto("sabonete", 5.0);
                produtos.add(produto2);
                Produto produto3 = new Produto("Calça", 40.0);
                produtos.add(produto3);
                Produto produto4 = new Produto("camisa", 35.0);
                produtos.add(produto4);
                Produto produto5 = new Produto("Biscoito", 3.0);
                produtos.add(produto5);
                Produto produto6 = new Produto("Televisão", 1000.0);
                produtos.add(produto6);
                Produto produto7 = new Produto("Bermuda", 10.0);
                produtos.add(produto7);
                Produto produto8 = new Produto("Mouse", 300.0);
                produtos.add(produto8);
                Produto produto9 = new Produto("Mouse-pad", 100.0);
                produtos.add(produto9);
                Produto produto10 = new Produto("Creme de pele", 20.0);
                produtos.add(produto10);
                System.out.println("Produtos Disponiveis por: " + nome);
                for(Produto p: produtos) {
                    System.out.println(p.getNomeProduto());
                }
                System.out.println("\n");
                Thread.sleep(1000);
                sinc.notify();
                sinc.wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public Queue<Produto> getProdutos() {
        return produtos;
    }

}
