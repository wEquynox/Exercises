#include <stdio.h>

int sequenciais(int a, int b){
    if(a == b){
        return a;
    }

    return sequenciais(a + 1, b) + a;
}

int main(){

    int a, b;
    scanf("%i %i", &a, &b);

    int result = sequenciais(a, b);

    printf("%i", result);

    return 0;
}