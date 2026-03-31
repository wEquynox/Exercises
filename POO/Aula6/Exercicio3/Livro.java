package Aula6.Exercicio3;

public class Livro {
        private String titulo;
    private String autor;
    private int quantidadePaginas;
    private boolean emprestado;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadePaginas() {
        return this.quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        if (quantidadePaginas > 0) {
            this.quantidadePaginas = quantidadePaginas;
        } else {
            System.out.println("Quantidade de páginas inválida!");
        }
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        emprestado = false;
        System.out.println("Livro devolvido com sucesso!");
    }

    public boolean isDisponivel() {
        return !emprestado;
    }
}



