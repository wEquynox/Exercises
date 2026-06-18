package Aula16.src;

public class Livro extends Midia {

    private String autor;

    public Livro(String autor, int codigo, String titulo) {
        super(codigo, titulo);
        this.autor = autor;
    }

    public String getDescricao() {
        return "Livro: " + getTitulo() + " - Autor: " + autor;
    }

    @Override
    public void emprestar() throws EmprestimoException {

        if (isEmprestado()) {
            throw new EmprestimoException("O livro já está emprestado.");
        }

        emprestado = true;
    }

}