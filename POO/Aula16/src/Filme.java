package Aula16.src;

public class Filme extends Midia {

    private String diretor;

    public Filme(String diretor, int codigo, String titulo) {
        super(codigo, titulo);
        this.diretor = diretor;
    }

    public String getDescricao() {
        return "Filme: " + getTitulo() + " - Diretor: " + diretor;
    }

    @Override
    public void emprestar() throws EmprestimoException {

        if (isEmprestado()) {
            throw new EmprestimoException("O filme já está emprestado.");
        }

        emprestado = true;
    }

}


