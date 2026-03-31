#include <stdio.h>

void troca(int *p1, int *p2){
    int temp;

    temp = *p1;
    *p1 = *p2;
    *p2 = temp;

    printf("p1 = a: %i\n", *p1);
    printf("p2 = b: %i\n", *p2);


}

int main(){

    int a, b;


    printf("Insira o valor de a: ");    
    scanf("%i", &a);

    printf("Insira o valor de b: ");
    scanf("%i", &b);

    troca(&a, &b);;

    return 0;
}