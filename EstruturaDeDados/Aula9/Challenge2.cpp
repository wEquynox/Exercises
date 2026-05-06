#include <iostream>
#include <list>

template <typename T>
class queue {

    public:
        std::list<T> queue_list;

        void push(T number) {
            queue_list.push_back(number);
        }

        bool empty() {
            return queue_list.empty();
        }

        void pop() {
            std::cout << queue_list.front() << std::endl;
            queue_list.pop_front();
        }
};

int main() {

    int number = 1;
    queue<int> queue1;

    std::cout << "Digite alguns números (0 encerra)\n"; 

    while(number != 0) {
        std::cin >> number;

        queue1.push(number);
    }

    while(queue1.empty() == false) {
        queue1.pop();
    }

    return 0;
}