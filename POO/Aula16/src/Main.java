package Aula16.src;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        while(true) {

            int number = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua ação:"
                + "\n1 - Cadastrar livro"
                + "\n2 - Cadastrar filme"
                + "\n3 - Listar mídias"
                + "\n4 - Realizar empréstimo"
                + "\n5 - Sair"));

            switch (number) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro:"));
                    String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
                    Livro livro = new Livro(autor, codigo, titulo);
                    biblioteca.cadastrarMidia(livro);
                    break;

                case 2:
                    String tituloFilme = JOptionPane.showInputDialog("Digite o título do filme:");
                    int codigoFilme = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme:"));
                    String diretor = JOptionPane.showInputDialog("Digite o diretor do filme:");
                    Filme filme = new Filme(diretor, codigoFilme, tituloFilme);
                    biblioteca.cadastrarMidia(filme);
                    break;
                case 3:
                    biblioteca.listarMidias();
                    break;

                case 4:
                    int codigoEmprestimo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da mídia para empréstimo:"));
                    try {
                        biblioteca.realizarEmprestimo(codigoEmprestimo);
                    } catch (EmprestimoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    return;

                default:
                    break;
            }

        }
    }

}
