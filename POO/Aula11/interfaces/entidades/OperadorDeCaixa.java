package interfaces.entidades;

public class OperadorDeCaixa extends Funcionario {

    public OperadorDeCaixa(String nome, String cpf) {
        super(nome, cpf);
    }

    public OperadorDeCaixa(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao(){
        return super.getSalario() * 0.2;
    }

}
