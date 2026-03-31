package Aula5;

public class Livro {
    
    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void imprimirDetalhes() {
        System.out.println("Título: " + this.titulo + "\n" + "Autor: " + this.autor);
    }
}
