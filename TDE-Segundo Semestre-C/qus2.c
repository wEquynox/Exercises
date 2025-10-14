#include <stdio.h>
#include <stdlib.h>

int maiorelemento(int tam, int *vet){
    int maior = vet[0];

    for(int i=1; i<tam; i++){
        if(vet[i] > maior){
            maior = vet[i];
        }
        
    }

    return maior;
    
}

int main(){

    int n;
    scanf("%i", &n);

    int *vet = (int*) malloc(n * sizeof(int));

    for(int i=0; i<n; i++){
        scanf("%i", &vet[i]);
    }

    int maior = maiorelemento(n, vet);

    printf("O maior elemento eh: %i", maior);

    free(vet);

    return 0;
}

    
