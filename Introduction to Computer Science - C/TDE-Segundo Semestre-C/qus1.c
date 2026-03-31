#include <stdio.h>
#include <stdlib.h>

int somadevalores(int n, int *vet){
    int soma = 0;

    for(int i=0; i<n; i++){
        soma = soma+vet[i];
    }

    return soma;
}

int main(){

    int n;
    scanf("%i", &n);

    int *vet = (int*) malloc(n * sizeof(int));

    for(int i=0; i<n; i++){
        scanf("%i", &vet[i]);
    }

    int soma = somadevalores(n, vet);

    printf("O valor da soma eh: %i!", soma);

    free(vet);

    
    return 0;
}