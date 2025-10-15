#include <stdio.h>

int mod(int a, int b){
    if(a == b){
        return 0;
    }

    else if(b > a){
        return a;
    }

    return mod(a - b, b);
}

int main(){
    int a, b;
    scanf("%i %i", &a, &b);

    int result = mod(a, b);

    printf("%i", result);

    return 0;
}