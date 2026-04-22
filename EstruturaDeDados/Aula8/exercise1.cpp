#include <iostream>
#include <stack>
#include <string>

int main() {

    std::string expression;
    std::stack<char> pile; //Cria uma pilha de caracteres

    std::cout << "Type an expression!" << std::endl;
    std::getline(std::cin, expression); //Le uma linha contando espaços até o enter
    
    for(int i = 0; i < expression.length(); i++) { //Percorre cada caractere da expressão

        if( //Verifica se o caractere da posição atual é uma abertura
            expression[i] == '[' ||
            expression[i] == '{' ||
            expression[i] == '('
        ) {
            pile.push(expression[i]); //Põe na pilha
        }

        else if( //Verifica se o caractere da posição atual é um fechamento
            expression[i] == ']' ||
            expression[i] == '}' ||
            expression[i] == ')'
        ) {
            if(pile.empty()) { //Se a pilha estiver vazia, é pq ja foi escrito errado ou nem foi escrito nada
                std::cout << "Malformed expression!" << std::endl;
                return 0;
            }

            char top = pile.top(); //Cria uma variavel que eh igual ao topo da pilha
            pile.pop(); //Tira o topo da pilha

            if( //Se o carectere do topo for um fechamento nao correspondente à sua abertura, ta errado
                (expression[i] == ']' && top != '[') ||
                (expression[i] == '}' && top != '{') ||
                (expression[i] == ')' && top != '(')
            ) {
                std::cout << "Malformed expression!" << std::endl;
                return 0;
            }
        }
        
    }



    if(pile.empty()) { //Se estiver vazia aqui, é pq deu tudo certo lá em cima e a expressão é bem formada
        std::cout << "Well formed expression!" << std::endl;
    }

    else {
        std::cout << "Malformed expression!" << std::endl;
    }
    

    return 0;
}