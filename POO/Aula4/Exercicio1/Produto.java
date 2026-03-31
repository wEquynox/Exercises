package Aula4.Exercicio1;

public class Produto {
    
    //Atributos
    String nome;
    int codigo;
    float preco;
    int quantidade;
    int saldo;

    boolean adicionarItem(int q){
        if(q > 0){
            this.quantidade += q;
            return true;
        }

        return false;
    }

    boolean vender(int q){
        if(q > this.quantidade){
            return false;
        }

        this.quantidade -= q;
        return true;
    }

    boolean removerItem(int q){
        if(q > this.quantidade || q < 0){
            return false;
        }

        this.quantidade -= q;
        return true;
    }

    int valorTotal(int q){
        return q * (int)this.preco;
    }
}
