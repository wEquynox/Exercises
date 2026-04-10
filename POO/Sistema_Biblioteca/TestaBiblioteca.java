package Sistema_Biblioteca;

import javax.swing.JOptionPane;

public class TestaBiblioteca {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        while(true) {

            showMenu(); // Exibe o menu para o usuário
            switch(JOptionPane.showInputDialog(" ")) {
                case "1":
                    cadastroLivro(biblioteca);
                    break;
                case "2":
                    cadastroCliente(biblioteca);
                    break;
                case "3":
                    realizarEmprestimo(biblioteca);
                    break;
                case "4":
                    devolverLivro(biblioteca);
                    break;
                case "5":
                    System.out.println("Obrigado por utilizar a Biblioteca!");
                    return;
                default:
                    System.out.println("!!! Opção inválida. Por favor, tente novamente !!! \n");
            }
        }

    }
    static void showMenu() {
    System.out.println("Seja Bem Vindo a Biblioteca! \n" +
            "Selecione o número correspondente à ação que deseja realizar: \n" +
            "(1) Cadastrar Livro \n" +
            "(2) Cadastrar Cliente \n" +
            "(3) Realizar Empréstimo \n" +
            "(4) Devolver Livro \n" +
            "(5) Sair \n"
            );
    }

    static void cadastroLivro(Biblioteca biblioteca) {
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor:");
        String nacionalidadeAutor = JOptionPane.showInputDialog("Digite a nacionalidade do autor:");
        String isbn = JOptionPane.showInputDialog("Digite o ISBN do livro:");

        Autor autor = new Autor(nomeAutor, nacionalidadeAutor);
        Livro livro = new Livro(titulo, autor, isbn);

        biblioteca.adicionarLivro(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");

    }

    static void cadastroCliente(Biblioteca biblioteca) {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");

        Cliente cliente = new Cliente(nome, cpf);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        biblioteca.adicionarCliente(cliente);
    }

    static void realizarEmprestimo(Biblioteca biblioteca) {
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String tituloLivro = JOptionPane.showInputDialog("Digite o título do livro:");
        
        Cliente cliente = biblioteca.buscarCliente(nomeCliente);
        Livro livro = biblioteca.buscarLivro(tituloLivro);
        
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado." + 
            "Por favor, cadastre o cliente antes de realizar o empréstimo.");
            return;
        }
        if(livro == null){
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            return;
        }
        biblioteca.emprestarLivro(livro, cliente);
        JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");

    }

    static void devolverLivro(Biblioteca biblioteca) {
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String tituloLivro = JOptionPane.showInputDialog("Digite o título do livro:");
        
        Cliente cliente = biblioteca.buscarCliente(nomeCliente);
        Livro livro = biblioteca.buscarLivroIndisponivel(tituloLivro);
        
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado. Por favor, cadastre o cliente antes de realizar a devolução.");
            return;
        }
        if(livro == null){
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            return;
        }
        biblioteca.devolverLivro(tituloLivro, cliente);
        JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!");
    }


}