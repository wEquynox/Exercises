#include <iostream>

//Recebe dois endereços, coloca os endereços nas duas variáveis pont e realiza a troca de valores 
void switchNumbersWPont(int *pont1, int *pont2) {
    int temp = *pont1;
    *pont1 = *pont2;
    *pont2 = temp;
}
//Recebe duas variáveis que viram referencia para os dois pont e por fim, realiza a troca de posições
void switchNumbersWRef(int &pont1, int &pont2) {
    int temp = pont1;
    pont1 = pont2;
    pont2 = temp;
}

int main() {

    int numberOne, numberTwo; //Cria duas variáveis comuns

    //Lê duas variáveis do usuário
    std::cout << "Type two numbers: " << std::endl;
    std::cin >> numberOne;
    std::cin >> numberTwo;

    switchNumbersWPont(&numberOne, &numberTwo); //Chama a função de ponteiros

    std::cout << "The switched numbers are: " << numberOne << " and " << numberTwo << std::endl;

    switchNumbersWRef(numberOne, numberTwo); //Chama a função de referências

    std::cout << "The switched numbers are: " << numberOne << " and " << numberTwo << std::endl;

    return 0;
}