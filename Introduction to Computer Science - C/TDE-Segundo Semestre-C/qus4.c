#include <stdio.h>
#include <stdlib.h>

int* funcao(int tam){
    int *vet = (int*) malloc(tam+1 * sizeof(int));

    for(int i=0; i<=tam; i++){
        vet[i] = i;
    }

    return vet;

}

int main(){

    int n;
    scanf("%i", &n);

    int *recebe = funcao(n);

    for(int i=1; i<=n; i++){
        printf("%i\n", recebe[i]);
    }

    free(recebe);

    return 0;
}