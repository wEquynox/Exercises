package Aula6.Exercicio1;

public class Principal {
    public static void main(String[] args) {

        Produto prod1 = new Produto();
        
        prod1.setNome("Gabriel");
        prod1.setPreco(20);
        prod1.setQuantidadeEmEstoque(10);

        prod1.adicionarEstoque(15);
        prod1.removerEstoque(5);
        System.out.println(prod1.calcularValorTotal());


    }
}
