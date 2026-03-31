package Aula5;

public class Aluno {
     private String nome;
     private double notas;

     public String getNome() {
        return this.nome;
     }

     public void setNome(String nome) {
        this.nome = nome;
     }

     public double getnotas() {
        return this.notas;
     }

     public void setNotas(double notas){
        this.notas = notas;
     }

     public double calcularMedia(double n, double d) {
        return (n + d) / 2;
     }
}
