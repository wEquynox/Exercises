#include <iostream>
#include <string>

bool cafe(std::string gostaOuNao);
bool verificacao(std::string ver);

int main(){

    struct D {
        std::string nome;
        int idade;
        double altura;
        std::string cafe;
    };

    D dados;

    std::cout << "Digite o primeiro nome:" << std::endl;
    std::cin >> dados.nome;
    
    std::cout << "Digite a idade:" << std::endl;
    std::cin >> dados.idade;
    
    std::cout << "Digite a altura:" << std::endl;
    std::cin >> dados.altura;

    std::cout << "Digite se gosta de cafe ou nao (use s ou n):" << std::endl;
    std::cin >> dados.cafe;
    
    while(verificacao(dados.cafe)){
        std::cout << "DIGITA CERTO FAZ O FAVOR" << std::endl;
        std::cout << "Digite se gosta de cafe ou nao (use s ou n):" << std::endl;
        std::cin >> dados.cafe;
    }
    
    if(cafe(dados.cafe)){
        dados.cafe = "gosta";
    }

    else{
        dados.cafe = "nao gosta";
    }
    
    
    //Mostrar dados

    std::cout << dados.nome << " tem " << dados.idade << " ano(s), " << dados.altura << "m e " << dados.cafe << " de cafe" << std::endl;

    return 0;
}

bool cafe(std::string gostaOuNao){

    if(gostaOuNao == "s"){
        return true;
    }
    else{
        return false;
    }
}

bool verificacao(std::string ver){
    if(ver != "n" && ver != "s"){
        return true;
    }
    
    return false;
    
}
