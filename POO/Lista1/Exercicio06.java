package Lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int contador = 0;
        int soma = 0;

        while(contador < 10){
            System.out.println("Digite um número: ");
            int número = leitor.nextInt();

            if(número > 0){
                soma += número;
            }

            contador++;
        }

        System.out.println("A soma dos números positivos é: " + soma);

        leitor.close();

    }
}
