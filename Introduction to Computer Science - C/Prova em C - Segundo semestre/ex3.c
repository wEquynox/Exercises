#include <stdio.h>

int main(){

    int matriz[4][3], cont = 0;

    for(int i = 0; i < 4; i++){
        for(int j = 0; j <3; j++){
            printf("Insira o numero: ");
            scanf("%i", &matriz[i][j]);
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
            if(matriz[i][j] % 2 == 0){
                cont++;
            }

            else{
                printf("%i eh impar\n", matriz[i][j]);
            }
        }
    }

    printf("A quantidade de pares eh: %i", cont);

    return 0;
}