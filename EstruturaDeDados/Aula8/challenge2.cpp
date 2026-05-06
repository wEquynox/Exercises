#include <iostream>

template <typename T>
struct Node
{
    T numero;
    T proximo;
    T anterior;
};


template <typename T>
class stack {
    public:

        Node<T> frente;
        frente.numero = nullptr;
        Node<T> tras;
        tras.numero = nullptr;

        T anterior = 0;
        T posterior = 0;

        void push_front(T numero) {
            Node<T> novoNode = new Node<T>();
            novoNode.numero = numero;
            frente.numero = novoNode.numero;
            posterior = numero;

            if(frente.numero != nullptr) {
                frente.proximo = posterior;
            }


        }

};

int main() {



    return 0;
}