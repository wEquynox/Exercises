#include <stdio.h>
#include <stdlib.h>

int* dobravetor(int tam, int *vet){
    int *vvet = (int*) malloc(tam * sizeof(int));

    for(int i=0; i<tam; i++){
        vvet[i] = 2 * vet[i];
    }
    return vvet;
}

int main(){

    int n;
    scanf("%i", &n);

    int *vet = (int*) malloc(n * sizeof(int));

    for(int i = 0; i < n; i++){
        scanf("%i", &vet[i]);
    }

    int *dobro = dobravetor(n, vet);

    for(int i=0; i<n; i++){
        printf("O dobro de %i eh %i!\n", vet[i], dobro[i]);
    }

    free(vet);
    free(dobro);
    
    return 0;
}