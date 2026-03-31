#include <iostream>
#include <cstdlib>
#include <ctime>

int main(){


    std::srand((std::time(nullptr)));

    int numeroSorteado = std::rand() % 51 + 50;
    int numeroDoUsuario;
    int contador = 0;

    while(true){

        std::cout << "Digite um numero" << std::endl;
        std::cin >> numeroDoUsuario;

        if(numeroDoUsuario == numeroSorteado){
            std::cout << "Voce acertou!!!" << std::endl;
            break;
        }

        else if(numeroDoUsuario > numeroSorteado){
            std::cout << "Voce errou! Tente um numero menor..." << std::endl;
            contador++;
        }

        else{
            std::cout << "Voce errou! Tente um numero maior..." << std::endl;
            contador++;
        }

    }

    std::cout << "Voce acertou em " << contador << " tentativas!" << std::endl;

    return 0;
}