package interfaces.entidades;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public Funcionario (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }//Sobrecarga de construtor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();

    @Override
    public String toString() {
        return "Funcionario->" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null){
            return false;
        }
        Funcionario f = (Funcionario) obj;

        if(this.cpf == f.getCpf()){
            return true;
        }
        return false;
    }
}
