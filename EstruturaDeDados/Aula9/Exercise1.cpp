#include <iostream>
#include <stack>
#include <queue>
#include <string>
#include <cctype>

int main() {

    std::stack<char> stk;
    std::queue<char> que;
    std::string words;

    std::cout << "Digite uma palavra ou frase: " << std::endl;
    std::getline(std::cin, words);

    for(int i = 0; i < words.length(); i++) {
        if(std::isspace(words[i]) || words[i] == ',' || words[i] == '-') {continue;}
        words[i] = std::tolower(words[i]);

        stk.push(words[i]);
        que.push(words[i]);
    }

    while(!stk.empty() && !que.empty()) {

        if(stk.top() == que.front()) {
            stk.pop();
            que.pop();
        }

        else {
            std::cout << "Nao eh um palindromo!!" << std::endl;
            return 0;
        }
        
    }

    
    std::cout << "Eh um palindromo!!" << std::endl;
    


    return 0;
}