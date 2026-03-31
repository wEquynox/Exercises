#include <stdio.h>

int mdc(int a, int b){
    if(b == 0){
        return a;
    }

    return mdc(b, a % b);
}

int main(){
    int a = 100;
    int b = 480;

    int result = mdc(a, b);

    printf("%i", result);

    return 0;
}