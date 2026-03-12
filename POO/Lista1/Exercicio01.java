package Lista1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite outro número: ");
        n2 = leitor.nextInt();

        if(n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for(int i = n1 + 1; i < n2; i++){
            System.out.println(i);
        }

        leitor.close();
    }
}
