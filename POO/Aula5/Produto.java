package Aula5;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        this.preco = this.preco * desconto / 100;
    }
}
