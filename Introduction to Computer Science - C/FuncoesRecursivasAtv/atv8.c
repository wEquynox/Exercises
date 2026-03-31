/*O código mostrado na atividade faz com que sejam somados todos os números inteiros de 0 até o número que o usuário digitar.
Exemplo: se o usuário digitar 3 será somado 0 + 1 + 2 + 3 = 6.*/

#include <stdio.h>

int main(){
    int a;
    scanf("%i", &a);

    int soma = 0;
    for(int i = a; i >= 0; i--){
        soma  = i + soma;
    }

    printf("%i", soma);
}