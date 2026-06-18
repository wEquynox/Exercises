package Aula16.src;

public abstract class Midia implements Emprestavel {
    
    private int codigo;
    private String titulo;
    protected boolean emprestado = false;

    public Midia(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public abstract String getDescricao();

    public void emprestar() throws EmprestimoException {
        if (emprestado) {
            throw new EmprestimoException("A mídia já está emprestada.");
        }
        emprestado = true;
    }
}
