package Aula6.Exercicio2;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota 1 inválida! Deve estar entre 0 e 10.");
        }
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota 2 inválida! Deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 6;
    }
}

