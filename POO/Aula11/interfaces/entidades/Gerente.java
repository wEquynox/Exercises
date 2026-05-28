package interfaces.entidades;

public class Gerente extends Funcionario { //Gerente é filha da classe  Funcionario
    //Gerente é SUB CLASSE de Funcionario

    private int senha;
    private  int totFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario); // invocando o construtor da classe mae
        this.senha = senha;
    }

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getTotFuncionariosGerenciados() {
        return totFuncionariosGerenciados;
    }
    public void setTotFuncionariosGerenciados(int totFuncionariosGerenciados) {
        this.totFuncionariosGerenciados = totFuncionariosGerenciados;
    }
    //aqui estou fazendo uma SOBRESCRITA de método


    public double getBonificacao(){
        return super.getSalario()*0.3;
    }
}
