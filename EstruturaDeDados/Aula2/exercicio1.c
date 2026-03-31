#include <stdio.h>

int main(){

    int number;
    printf("Digite um numero inteiro: ");
    scanf("%i", &number);

    printf("%i / ", number);
    printf("0x%02X / ", number);
    printf("%03o\n", number);

    return 0;
}