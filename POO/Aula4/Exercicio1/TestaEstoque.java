package Aula4.Exercicio1;

import javax.swing.JOptionPane;

public class TestaEstoque {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "coca cola";
        p1.preco = 12.0F;
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));

        if(p1.adicionarItem(n) == false){
            System.out.println("Quantidade invalida");
        }

        JOptionPane.showMessageDialog(null, "Total de itens: " + p1.quantidade);


        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser vendida: "));

        if(p1.vender(n)){
            System.out.println("Venda realizada");
        }

        else{
            JOptionPane.showMessageDialog(null, "Possui apenas: " + p1.quantidade + " itens em estoque");
        }

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser removida: "));

        if(p1.removerItem(n)){
            System.out.println("Remoção realizada");
        }

        else{
            JOptionPane.showMessageDialog(null, "Possui apenas: " + p1.quantidade + " itens em estoque");
        }

        System.out.println(p1.nome + " possui " + p1.quantidade + " itens");

        System.out.println("Valor total: " + p1.valorTotal(p1.quantidade));

        
    }
}