package Aula4.Exercicio2;

public class Aluno {

    //Atributos
    String nome;
    int matricula;
    int nota1;
    int nota2;

    //Métodos
    double calcularMedia(int nota1, int nota2) {
        return (nota1 + nota2) / 2.0;
    }

    boolean verificarAprovacao() {
        if(calcularMedia(nota1, nota2) >= 6.0) {
            return true;
        } 
        
        return false;
    }
}
