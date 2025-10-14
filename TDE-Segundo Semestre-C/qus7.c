#include <stdio.h>
#include <stdlib.h>

int *invertevetor(int tam, int *vet){
    int *vet2 = (int*) malloc(tam * sizeof(int));

    for(int i=0; i<tam; i++){
        vet2[i] = vet[(tam - 1)-i];
    }

    return  vet2;
}

int main(){

    int n;
    scanf("%i", &n);

    int *vet = (int*) malloc(n * sizeof(int));

    for(int i=0; i<n; i++){
        scanf("%i", &vet[i]);
    }

    vet = invertevetor(n, vet);

    for(int i=0; i<n; i++){
        printf("%i ", vet[i]);
    }

    free(vet);

    return 0;
}