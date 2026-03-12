package Lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int número = leitor.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= número; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + número + " é: " + fatorial);

        leitor.close();
    }
}
