package Lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int número = leitor.nextInt();
        int contador = 1;
        int quantidade = 0;

        while(contador <= número) {
            if (contador % 2 != 0) {        
                quantidade++;
            }
            contador++;
        }

        System.out.println("Existem " + quantidade + " números ímpares entre 1 e " + número);

        leitor.close();

    }
}
