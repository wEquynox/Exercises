#include <iostream>

int main(){

    enum class Meses{
        Janeiro = 1,
        Fevereiro,
        Marco,
        Abril,
        Maio,
        Junho,
        Julho,
        Agosto,
        Setembro,
        Outubro,
        Novembro,
        Dezembro
    };

    std::cout << "Digite um numero" << std::endl;
    int numero;
    std::cin >> numero;
    Meses mes = static_cast<Meses>(numero);

    switch(mes) {
        case Meses::Janeiro:
            std::cout << "Janeiro" << std::endl;
            break;

        case Meses::Fevereiro:
            std::cout << "Fevereiro" << std::endl;
            break;

        case Meses::Marco:
            std::cout << "Março" << std::endl;
            break;

        case Meses::Abril:
            std::cout << "Abril" << std::endl;
            break;

        case Meses::Maio:
            std::cout << "Maio" << std::endl;
            break;

        case Meses::Junho:
            std::cout << "Junho" << std::endl;
            break;

        case Meses::Julho:
            std::cout << "Julho" << std::endl;
            break;

        case Meses::Agosto:
            std::cout << "Agosto" << std::endl;
            break;

        case Meses::Setembro:
            std::cout << "Setembro" << std::endl;
            break;

        case Meses::Outubro:
            std::cout << "Outubro" << std::endl;
            break;

        case Meses::Novembro:
            std::cout << "Novembro" << std::endl;
            break;

        case Meses::Dezembro:
            std::cout << "Dezembro" << std::endl;
            break;

        default:
            std::cout << "Numero invalido!!!" << std::endl;
    }

    return 0;
}