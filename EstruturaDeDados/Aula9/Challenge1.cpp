#include <iostream>
#include <queue>
#define MAX_SIZE 5

template <typename type>

class queue {

    public:
        type vet[MAX_SIZE];
        int front = -1;
        int end = -1;

        void push(type anything) {
            end++;
            vet[end] = anything;

        }

        void pop() {
            front++;
            std::cout << vet[front] << ' ';
        }

        bool empty() {
            if(front == end) {
                return true;
            }

            else {
                return false;
            }
        }

};

int main() {

    queue<int> queue1;
    int number = 1;

    std::cout << "Type numbers to be queued (type 0 to end) \n";
    while(number != 0) {
        std::cin >> number;

        queue1.push(number);
    }

    std::cout << "Voce enfileirou: \n";
    while(!queue1.empty()) {
        queue1.pop();
    }

    return 0;
}