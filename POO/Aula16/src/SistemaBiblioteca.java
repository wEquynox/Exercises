package Aula16.src;
import java.util.ArrayList;

public class SistemaBiblioteca {
    
    ArrayList<Midia> midias = new ArrayList<Midia>();

    public void cadastrarMidia(Midia m) {
        midias.add(m);
    }

    public void listarMidias() {
        for (Midia m : midias) {
            System.out.println(m.getDescricao());
        }
    }

    public void realizarEmprestimo(int codigo) throws EmprestimoException {
        for(Midia m : midias) {
            if(m.getCodigo() == codigo) {
                m.emprestar();
                System.out.println("Empréstimo realizado: " + m.getDescricao());
                return;
            }
        }
        throw new EmprestimoException("Mídia não encontrada.");
    }
}
