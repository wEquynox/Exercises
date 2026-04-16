#include <iostream>

int main() {

    int numberOne, numberTwo;

    std::cout << "Type two numbers: " << std::endl;
    std::cin >> numberOne;
    std::cin >> numberTwo;

    int *adress1 = &numberOne;
    int *adress2 = &numberTwo;

    int temp = *adress1;
    *adress1 = *adress2;
    *adress2 = temp;

    std::cout << "The switched numbers are: " << numberOne << " and " << numberTwo << std::endl;

    return 0;
}