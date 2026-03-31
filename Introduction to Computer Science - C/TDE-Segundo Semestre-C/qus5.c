#include <stdio.h>
#include <stdlib.h>

int *somaVetores(int tam1, int *vet1, int *vet2){

    int *vet3 = (int*) malloc(tam1 * sizeof(int));

    for(int i=0; i<tam1; i++){
        vet3[i] = vet1[i] + vet2[i];
    }

    return vet3;
}

int main(){

    int n1;
    scanf("%i", &n1);

    int *vet1 = (int*) malloc(n1 * sizeof(int));
    int *vet2 = (int*) malloc(n1 * sizeof(int));

    for(int i=0; i<n1; i++){
        scanf("%i", &vet1[i]);
        scanf("%i", &vet2[i]);
    }

    int *recebe = somaVetores(n1, vet1, vet2);

    for(int i=0; i<n1; i++){
        printf("O resultado da soma eh: %i\n", recebe[i]);
    }

    free(vet1);
    free(vet2);
    free(recebe);



    return 0;
}