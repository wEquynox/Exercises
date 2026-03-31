#include <stdio.h>

int main(){

    int num, vet[10];
    int resultado[10];

    printf("Digite um numero: ");
    scanf("%i", &num);

    for(int i = 0; i < 10; i++){
        printf("Insira os numeros que serao multpilicados: ");
        scanf("%i", &vet[i]);
    }

    for(int i = 0; i < 10; i++){

        resultado[i] = num * vet[i];
    }

    for(int i = 0; i < 10; i++){
        printf("%i\n", resultado[i]);
    }

    return 0;
}