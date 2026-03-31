#include <stdio.h>
#include "funcoes.c"
int main(){

    int x1, x2, y1, y2;

    printf("Insira respectivamente: x1, x2, y1, y2: ");
    scanf("%i %i %i %i", &x1, &x2, &y1, &y2);

    float result = distanciaEntrePontos(x1, x2, y1, y2);

    printf("A distancia eh de: %f", result);
    
    return 0;
}

