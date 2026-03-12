package Lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int número;
        System.out.println("Digite um número: ");
        número = leitor.nextInt();
        int contador = 0;

        while(contador <= número){
            contador++;

            if(número % contador == 0){
                System.out.println(contador);
            }
        }

        leitor.close();
    }
}
