package Lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }

        leitor.close();

    }
}
