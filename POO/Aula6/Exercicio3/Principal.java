package Aula6.Exercicio3;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setQuantidadePaginas(256);

        Livro livro2 = new Livro();
        livro2.setTitulo("O Hobbit");
        livro2.setAutor("J.R.R. Tolkien");
        livro2.setQuantidadePaginas(310);

        livro1.emprestar();
        livro1.emprestar();

        livro2.emprestar();
        livro2.devolver();

        System.out.println("\nLivro: " + livro1.getTitulo());
        System.out.println("Disponível: " + (livro1.isDisponivel() ? "Sim" : "Não"));

        System.out.println("\nLivro: " + livro2.getTitulo());
        System.out.println("Disponível: " + (livro2.isDisponivel() ? "Sim" : "Não"));
    }
}