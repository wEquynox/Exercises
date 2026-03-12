package Lista1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        System.out.println("Digite um número: ");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        int contador = 0;

        while(contador <= 100){
            if(contador % n == 0){
                System.out.println(contador);
            }

            contador++;
        }

        leitor.close();

    }
}
