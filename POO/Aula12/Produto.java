package Aula12;

public class Produto implements Tributavel {
    private String nome;
    private double valor;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Produto(){}


    public double getValorImposto() {
        return this.valor * 10/100;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

}
