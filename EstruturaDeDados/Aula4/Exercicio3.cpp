#include <iostream>

union NumberBits{
    unsigned int number;
    struct {
        unsigned int bit0 : 1;
        unsigned int bit1 : 1;
        unsigned int bit2 : 1;
        unsigned int bit3 : 1;
        unsigned int bit4 : 1;
        unsigned int bit5 : 1;
        unsigned int bit6 : 1;
        unsigned int bit7 : 1;
        unsigned int bit8 : 1;
        unsigned int bit9 : 1;
        unsigned int bit10 : 1;
        unsigned int bit11 : 1;
        unsigned int bit12 : 1;
        unsigned int bit13 : 1;
        unsigned int bit14 : 1;
        unsigned int bit15 : 1;
        unsigned int bit16 : 1;
        unsigned int bit17 : 1;
        unsigned int bit18 : 1;
        unsigned int bit19 : 1;
        unsigned int bit20 : 1;
        unsigned int bit21 : 1;
        unsigned int bit22 : 1;
        unsigned int bit23 : 1;
        unsigned int bit24 : 1;
        unsigned int bit25 : 1;
        unsigned int bit26 : 1;
        unsigned int bit27 : 1;
        unsigned int bit28 : 1;
        unsigned int bit29 : 1;
        unsigned int bit30 : 1;
        unsigned int bit31 : 1;
    };
};

void ShowNumberBits(int number) {
    union NumberBits number_bits;
    number_bits.number = number;

    std::cout << "Bits of the number" << std::endl;
    std::cout << number_bits.bit31 << ",";
    std::cout << number_bits.bit30 << ",";
    std::cout << number_bits.bit29 << ",";
    std::cout << number_bits.bit28 << ",";
    std::cout << number_bits.bit27 << ",";
    std::cout << number_bits.bit26 << ",";
    std::cout << number_bits.bit25 << ",";
    std::cout << number_bits.bit24 << "," << std::endl;
    std::cout << number_bits.bit23 << ",";
    std::cout << number_bits.bit22 << ",";
    std::cout << number_bits.bit21 << ",";
    std::cout << number_bits.bit20 << ",";
    std::cout << number_bits.bit19 << ",";
    std::cout << number_bits.bit18 << ",";
    std::cout << number_bits.bit17 << ",";
    std::cout << number_bits.bit16 << "," << std::endl;
    std::cout << number_bits.bit15 << ",";
    std::cout << number_bits.bit14 << ",";
    std::cout << number_bits.bit13 << ",";
    std::cout << number_bits.bit12 << ",";
    std::cout << number_bits.bit11 << ",";
    std::cout << number_bits.bit10 << ",";
    std::cout << number_bits.bit9 << ",";
    std::cout << number_bits.bit8 << "," << std::endl;
    std::cout << number_bits.bit7 << ",";
    std::cout << number_bits.bit6 << ",";
    std::cout << number_bits.bit5 << ",";
    std::cout << number_bits.bit4 << ",";
    std::cout << number_bits.bit3 << ",";
    std::cout << number_bits.bit2 << ",";
    std::cout << number_bits.bit1 << ",";
    std::cout << number_bits.bit0 << std::endl;
}



int main(void) {
    int number;
    std::cout << "Digite um numero: " << std::endl;
    std::cin >> number;

    ShowNumberBits(number);
}