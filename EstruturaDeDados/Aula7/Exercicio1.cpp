#include <iostream>
#include <cstdlib>
#include <ctime>
#include <iomanip>
int main() {

    int vet[100];

    for (int i = 0; i < 100; i++) {
        vet[i] = i;
    }

    std::srand(static_cast<unsigned>(std::time(nullptr)));

    for (int i = 99; i > 0; i--) {
        int j = std::rand() % (i + 1);

        int temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
    }

    for (int i = 0; i < 100; i++) {
        std::cout << std::setw(2) << std::setfill('0') << vet[i] << ' ';

        if ((i + 1) % 10 == 0) {
            std::cout << std::endl;
        }
    }

    return 0;
}