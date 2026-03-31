#include <stdio.h>

int main(){

    int matriz[4][5], soma = 0, cont;

    for(int i = 0; i < 4; i++){
        for(int j = 0; j <5; j++){
            printf("Insira o numero: ");
            scanf("%i", &matriz[i][j]);
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j <5; j++){
            soma = matriz[i][j] + soma;
            cont++;
        }
    }

    int divisao = soma / cont;

    printf("O resultado da media eh: %i", divisao);

    return 0;
}