package TDE3.exercise35;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;

    public double getGastos() {
        return this.salario;
    }

    public String getInfo() {
        return "Nome: " + this.nome + "com salário: " + this.salario;
    }
}