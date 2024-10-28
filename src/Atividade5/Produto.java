package Atividade5;

public class Produto {

    private final String nomeProduto;
    private double valor;


    public Produto(String nomeProduto, double valor){
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }
}
