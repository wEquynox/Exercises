package Sistema_Biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    
    //Atributos
    private ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();


    //Métodos
    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void emprestarLivro(Livro livro, Cliente cliente) {
        if(livrosEmprestados.contains(livro)) {
            System.out.println("Livro indisponível para empréstimo.");
            return;
        }
        livrosDisponiveis.remove(livro);
        livrosEmprestados.add(livro);
        Emprestimo emprestimo = new Emprestimo(cliente, livro);
        emprestimos.add(emprestimo);
    }

    public void devolverLivro(String livro, Cliente cliente) {
        Livro livroEncontrado = buscarLivroIndisponivel(livro);
        Cliente clienteEncontrado = buscarCliente(cliente.getNome());
        if (livroEncontrado != null && clienteEncontrado != null) {
            livrosEmprestados.remove(livroEncontrado);
            livrosDisponiveis.add(livroEncontrado);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro.getTitulo() + " por " + livro.getAutor().getNome());
                return livro;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Cliente encontrado: " + cliente.getNome() + " com CPF: " + cliente.getCpf());
                return cliente;
            }
        }
            return null;
    }

        public Livro buscarLivroIndisponivel(String titulo) {
        for (Livro livro : livrosEmprestados) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro.getTitulo() + " por " + livro.getAutor().getNome());
                return livro;
            }
        }
        return null;
}

}