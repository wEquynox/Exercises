#include <iostream>
#include <iomanip>

int main(){

    int number;
    std::cout << "Digite um numero inteiro: ";
    std::cin >> number;

    std::cout << number << " / ";
    std::cout << "0x" << std::hex << std::setw(2) << std::setfill('0') << std::uppercase << number << " / ";
    std::cout << std::setw(3) << std::setfill('0') << std::oct << number << std::endl;


    return 0;
}