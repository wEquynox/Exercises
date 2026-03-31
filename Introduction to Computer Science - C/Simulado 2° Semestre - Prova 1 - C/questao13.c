#include <stdio.h>


int main(){

int quant;

printf("Insira a quantidade de notas: \n");
scanf("%i", &quant);

int notas[quant];

int soma = 0;

for(int i = 0; i < quant; i++){
    printf("Insira o valor da notas: \n");
    scanf("%i", &notas[i]);
    soma = soma + notas[i];
}

int media = soma / quant;

printf("A media das notas eh: %i\n", media);


    return 0;
}