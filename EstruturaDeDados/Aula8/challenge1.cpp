#include <iostream>


template <typename type>
class pile {
public:

    type vet[3];
    int top = -1;

    void push(type number) {
        top++;
        vet[top] = number;
    }

    void pop() {
        std::cout << vet[top] << std::endl;
        top--;
    }

    bool empty() {
        return top == -1;
    }
};

int main() {

    int number = 0;
    pile<int> pile1;
    

    do {
        std::cout << "Digite numeros (0 encerra o processo)" << std::endl;
        std::cin >> number;
        pile1.push(number);

    } while (number != 0);

    while(!pile1.empty()) {
        pile1.pop();
    }

    return 0;
}