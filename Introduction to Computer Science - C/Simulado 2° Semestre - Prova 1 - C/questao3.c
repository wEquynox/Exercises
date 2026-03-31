#include <stdio.h>

int main(){

    int mat[3][3], inteiro;

    printf("Insire o valor do inteiro: ");
    scanf("%i", &inteiro);

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            printf("Insira os valores da matriz: ");
            scanf("%i", &mat[i][j]);
            }
        }


    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(inteiro % mat[i][j] == 0){
                printf("%i ", mat[i][j]);
            }
        }
    }


    return 0;
}