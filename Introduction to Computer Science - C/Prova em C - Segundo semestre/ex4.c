#include <stdio.h>
#include "funcoes.c"

int main(){

    float dist, temp;

    printf("Insira respectivamente a distancia e o tempo: ");
    scanf("%f %f", &dist, &temp);

    float result = velocidade(dist, temp);

    printf("A velocidade total eh: %.2f Km/h", result);

    return 0;
}