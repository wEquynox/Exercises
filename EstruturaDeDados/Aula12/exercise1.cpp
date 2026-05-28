#include <iostream>
#include <ctime>
#include <unordered_set>
#include <iomanip>

int main() {

    std::srand(std::time(0));

    std::unordered_set<int> bingo;

    while(bingo.size() <= 99) {
        int number = std::rand() % 100;
        bingo.insert(number);
    }

    int counter = 0;

    for(int n : bingo) {
        
        if(counter % 10 == 0) {
            std::cout << std::endl;
        }

        counter++;

        std::cout << std::setw(2) << std::setfill('0') << n << " ";
    }

    std::cout << std::endl;

    return 0;
}