#include <iostream>

char um = '1', dois = '2', tres = '3';
char quatro = '4', cinco = '5', seis = '6';
char sete = '7', oito = '8', nove = '9';


void mostrarHUD(){
    std::cout << um << " | " << dois << " | " << tres << std::endl;
    std::cout << "---------" << std::endl;
    std::cout << quatro << " | " << cinco << " | " << seis << std::endl;
    std::cout << "---------" << std::endl;
    std::cout << sete << " | " << oito << " | " << nove << std::endl;
    std::cout << std::endl;
    std::cout << "Digite um numero de acordo com o local de sua escolha" << std::endl;
}

bool atualizarHUD(int escolha, char simbolo){

    switch(escolha){

        case 1:
            if(um == 'X' || um == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            um = simbolo;
            return true;

        case 2:
            if(dois == 'X' || dois == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            dois = simbolo;
            return true;

        case 3:
            if(tres == 'X' || tres == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            tres = simbolo;
            return true;

        case 4:
            if(quatro == 'X' || quatro == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            quatro = simbolo;
            return true;

        case 5:
            if(cinco == 'X' || cinco == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            cinco = simbolo;
            return true;

        case 6:
            if(seis == 'X' || seis == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            seis = simbolo;
            return true;

        case 7:
            if(sete == 'X' || sete == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            sete = simbolo;
            return true;

        case 8:
            if(oito == 'X' || oito == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            oito = simbolo;
            return true;

        case 9:
            if(nove == 'X' || nove == 'O'){
                std::cout << "Escolha invalida, tente novamente!!!\n" << std::endl;
                return false;
            }
            nove = simbolo;
            return true;
    }

    // caso chegue aqui (escolha fora de 1..9), marca como inválida
    return false;
}

bool preencherHUD(){

    if(um != '1' && dois != '2' && tres != '3' && quatro != '4' && cinco != '5' && seis != '6' && sete != '7' && oito != '8' && nove != '9'){
        std::cout << "Deu velha!!!" << std::endl;
        return true;
    }

    if(um == dois && dois == tres){
        std::cout << "Jogador " << um << " venceu!!!" << std::endl;
        return true;
    }

    if(quatro == cinco && cinco == seis){
        std::cout << "Jogador " << quatro << " venceu!!!" << std::endl;
        return true;
    }

    if(sete == oito && oito == nove){
        std::cout << "Jogador " << sete << " venceu!!!" << std::endl;
        return true;
    }

    if(um == quatro && quatro == sete){
        std::cout << "Jogador " << um << " venceu!!!" << std::endl;
        return true;
    }

    if(dois == cinco && cinco == oito){
        std::cout << "Jogador " << dois << " venceu!!!" << std::endl;
        return true;
    }

    if(tres == seis && seis == nove){
        std::cout << "Jogador " << tres << " venceu!!!" << std::endl;
        return true;
    }

    if(um == cinco && cinco == nove){
        std::cout << "Jogador " << um << " venceu!!!" << std::endl;
        return true;
    }

    if(tres == cinco && cinco == sete){
        std::cout << "Jogador " << tres << " venceu!!!" << std::endl;
        return true;
    }

    return false;
}

int main(){

    std::cout << "Bem vindo ao jogo da velha!!!" << std::endl;
    mostrarHUD();

    while(true){

        while(true){

            std::cout << "Jogador 1: ";
            int escolha1;
            std::cin >> escolha1;

            if(escolha1 < 1 || escolha1 > 9){
                std::cout << "Escolha inválida, tente novamente!!!" << std::endl;
                continue;
            }
        
            if(atualizarHUD(escolha1, 'X') == false){
                continue;
            }

            mostrarHUD();
            break;
        }

        if(preencherHUD()){
            break;
        }

        while(true){

            std::cout << "Jogador 2: ";
            int escolha2;
            std::cin >> escolha2;

            if(escolha2 < 1 || escolha2 > 9){
                std::cout << "Escolha inválida, tente novamente!!!" << std::endl;
                continue;
            }

            if(atualizarHUD(escolha2, 'O') == false){
                continue;
            }
            
            mostrarHUD();
            break;

        }

        if(preencherHUD()){
            break;
        }

    }
    return 0;
}