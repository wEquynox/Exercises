package Aula4.Exercicio3;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Pinóquio";
        livro1.autor = "N sei kk";
        livro1.quantidadePaginas = 67;
        livro1.disponivel = true;

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Quantidade de Páginas: " + livro1.quantidadePaginas);
        System.out.println("Disponível: " + livro1.verificarDisponibilidade());

        String n = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja emprestar o livro: ");

        if(livro1.emprestar(n)) {
            System.out.println("Livro emprestado com sucesso!");
        } 
        
        else{
            System.out.println("Livro não disponível para empréstimo.");
        }

        String d = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja devolver o livro: ");

        if(livro1.devolver(d)) {
            System.out.println("Livro devolvido com sucesso!");
        } 
        
        else{
            System.out.println("Livro já está disponível.");
        }

        System.out.println("Disponível: " + livro1.verificarDisponibilidade());
    }
}
