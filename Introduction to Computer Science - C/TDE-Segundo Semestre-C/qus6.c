#include <stdio.h>
#include <stdlib.h>

int *concatenavetores(int tam1, int tam2, int *vet1, int *vet2){

    int *vet3 =(int*) malloc((tam1+tam2) * sizeof(int));

    for(int i=0; i<tam1; i++){
        vet3[i] = vet1[i];
    }

    for(int i=0; i<tam2; i++){
        vet3[i+tam1] = vet2[i];
    }

    return vet3;
}

int *quantidade(int tam1, int tam2){
    int quant;
    int *pquant = &quant;

    quant = tam1 +tam2;

    return pquant;
}

int main(){

    int tam1;
    scanf("%i", &tam1);

    int tam2;
    scanf("%i", &tam2);

    int *vet1 = (int*) malloc(tam1 * sizeof(int));
    int *vet2 = (int*) malloc(tam2 * sizeof(int));

    for(int i=0; i<tam1; i++){
        scanf("%i", &vet1[i]);
    }

    for(int i=0; i<tam2; i++){
        scanf("%i", &vet2[i]);
    }

    int *recebe = concatenavetores(tam1, tam2, vet1, vet2);

    for(int i=0; i<tam1+tam2; i++){
        printf("%i\n", recebe[i]);
    }

    int *quant = quantidade(tam1, tam2);

    printf("A quantidade de elementos eh %i\n", *quant);

    free(vet1);
    free(vet2);
    free(recebe);

    return 0;
}