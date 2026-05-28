#include <iostream>
#include <ctime>
#include <unordered_map>

int main() {

    std::srand(std::time(0));

    std::unordered_map<int, int> counter;

    for (int i = 0; i < 1000; ++i) {
        int number = std::rand() % 10;
        counter[number]++;
    }

    for(int i = 0; i <= 9; i++) {
        std::cout << "Number " << i << " = " << counter[i] << " times" << std::endl;
    }

    return 0;
}