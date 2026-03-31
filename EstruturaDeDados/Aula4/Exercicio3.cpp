#include <iostream>
using namespace std;

union Numero {
    int valor;
    unsigned char bytes[4]; // 4 bytes
};

int main() {
    Numero n;
    cin >> n.valor;

    for (int i = 3; i >= 0; i--) {
        for (int j = 7; j >= 0; j--) {
            cout << ((n.bytes[i] >> j) & 1) << ",";
        }
        cout << endl;
    }

    return 0;
}
/*
#include <iostream>
using namespace std;

union Numeros {
    int valor;
    
    struct {
        unsigned char byte0;
        unsigned char byte1;
        unsigned char byte2;
        unsigned char byte3;
    } bytes;
};

int main() {
    Numeros n;
    cin >> n.valor;

    // percorrer os bytes
    for (int i = 3; i >= 0; i--) {
        unsigned char b;

        if (i == 0) b = n.bytes.byte0;
        if (i == 1) b = n.bytes.byte1;
        if (i == 2) b = n.bytes.byte2;
        if (i == 3) b = n.bytes.byte3;

        // percorrer os bits
        for (int j = 7; j >= 0; j--) {
            cout << ((b >> j) & 1) << ",";
        }
        cout << endl;
    }

    return 0;
}