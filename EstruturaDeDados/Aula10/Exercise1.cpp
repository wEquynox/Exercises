#include <iostream>
#include <list>
#include <string>
#include <cctype>

int main() {

    std::list<char> char_list_queue;
    std::list<char> char_list_stack;
    std::string words;

    std::cout << "type a phrase or a word\n";
    std::getline(std::cin, words);

    for(char i : words) {
        if(i == ' '){
            continue;
        }

        i = std::tolower(i);
        
        char_list_queue.push_back(i);
        char_list_stack.push_front(i);
    }

    while(!char_list_queue.empty()) {
        if(char_list_queue.front() == char_list_stack.front()) {
            char_list_queue.pop_front();
            char_list_stack.pop_front();
        }

        else {
            std::cout << "its not a palindrome" << std::endl;
            return 0;
        }
    }
    
    std::cout << "its a palindrome" << std::endl;
    
    return 0;
}