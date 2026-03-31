package Aula4.Exercicio2;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = JOptionPane.showInputDialog("Digite o nome do aluno 1: ");
        aluno1.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno 1: "));
        int n1 = aluno1.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1 do aluno 1: "));
        int n2 = aluno1.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2 do aluno 1: "));

        if(aluno1.calcularMedia(n1, n2) > 10 || aluno1.calcularMedia(n1, n2) < 0) {
            JOptionPane.showMessageDialog(null, "Média inválida!");
        } else {
            if(aluno1.verificarAprovacao()) {
                JOptionPane.showMessageDialog(null, "Aluno aprovado!");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno reprovado!");
            }
        }

        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Média: " + aluno1.calcularMedia(n1, n2));

            
    }
}
