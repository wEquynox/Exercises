package Aula6.Exercicio1;


public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //Métodos Get/Set

    public String getNome() {
        return this.nome;
    }
    public void setNome(String newName) {
        this.nome = newName;
    }

    // -----------------------

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double newPreco) {
        if(newPreco < 0){
            System.out.println("Preço inválido!!\n");
        }

        else{
            this.preco = newPreco;
            System.out.println("Operação realizada com sucesso!!!\n");
        }
    }

    // -----------------------

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int newQnt) {
        if(newQnt < 0){
            System.out.println("Quantidade inválida!!\n");
        }

        else{
            this.quantidadeEmEstoque = newQnt;
            System.out.println("Operação realizada com sucesso!!!\n");
        }
    }

    //Métodos

    public void adicionarEstoque(int add) {
        if(add < 0) {
            System.out.println("Valor inválido!!!\n");
        }

        else {
            this.quantidadeEmEstoque += add;
            System.out.println("Operação realizada com sucesso!!!\n");
        }
    }

    public void removerEstoque(int number) {
        if(number < 0) {
            System.out.println("Valor inválido!!!\n");
        }

        else {
            this.quantidadeEmEstoque -= number;
            System.out.println("Operação realizada com sucesso!!!\n");
        }
    }

    public double calcularValorTotal() {
        return (this.preco * this.quantidadeEmEstoque);
    }



}
