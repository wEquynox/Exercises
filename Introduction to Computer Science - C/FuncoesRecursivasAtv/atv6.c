#include <stdio.h>

int exp(int x, int n){
    if(n == 0){
        return 1;
    }

    return x * exp(x, n - 1);
}

int main(){
    int a = 3;
    int b = 5;

    int resultado = exp(a, b);
    printf("%d^%d = %d\n", a, b, resultado);

    return 0;
}