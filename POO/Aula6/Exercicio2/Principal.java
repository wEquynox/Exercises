package Aula6.Exercicio2;

public class Principal {
        public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setMatricula("001");
        aluno1.setNota1(7.5);
        aluno1.setNota2(8.0);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setMatricula("002");
        aluno2.setNota1(5.0);
        aluno2.setNota2(6.0);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + (aluno1.isAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println();

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Situação: " + (aluno2.isAprovado() ? "Aprovado" : "Reprovado"));
    }
}

