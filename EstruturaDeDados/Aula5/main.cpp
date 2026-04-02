#include <iostream>                
#include <string>

class Signos {

    private: int mes;
    private: int dia;
    private: std::string signo;

    public:
        std::string getSigno() {
            return this->signo;
    }

    public:
        void setMes(int mes) {
            if(mes < 1 || mes > 12) {
                std::cout << "Mes invalido!" << std::endl;
                this->mes = 0;
                return;
            }

            this->mes = mes;
        }

    public:
        void setDia(int dia) {
            if(dia < 1 || dia > 31) {
                std::cout << "Dia invalido!" << std::endl;
                this->dia = 0;
                this->mes = 0;
                return;
            }

            this->dia = dia;
        }

    public:
        void verificarSigno(){
            switch(this->mes) {
                case 1:
                    if(this->dia >= 20)
                        this->signo = "Aquario";

                    else 
                        this->signo = "Capricornio";

                    break;
                
                case 2:
                    if(this->dia >= 19)
                        this->signo = "Peixes";

                    else
                        this->signo = "Aquario";

                    break;

                case 3:
                    if(this->dia >= 21)
                        this->signo = "Aries";

                    else
                        this->signo = "Peixes";

                    break;

                case 4:
                    if(this->dia >= 20)
                        this->signo = "Touro";

                    else
                        this->signo = "Aries";

                    break;

                case 5: 
                    if(this->dia >= 21)
                        this->signo = "Gemeos";

                    else
                        this->signo = "Touro";

                    break;

                case 6:
                    if(this->dia >= 21)
                        this->signo = "Cancer";

                    else
                        this->signo = "GGemeos";

                    break;

                case 7:
                    if(this->dia >= 23)
                        this->signo = "Leao";

                    else
                        this->signo = "Cancer";

                    break;

                case 8:
                    if(this->dia >= 23)
                        this->signo = "Virgem";

                    else
                        this->signo = "Leao";

                    break;

                case 9:
                    if(this->dia >= 23)
                        this->signo = "Libra";

                    else
                        this->signo = "Virgem";

                    break;

                case 10:
                    if(this->dia >= 23)
                        this->signo = "Escorpiao";

                    else
                        this->signo = "Libra";

                    break;

                case 11:
                    if(this->dia >= 22)
                        this->signo = "Sagitario";

                    else
                        this->signo = "Escorpiao";

                    break;

                case 12:
                    if(this->dia >= 22)
                        this->signo = "Capricornio";
                    
                    else
                        this->signo = "Sagitario";

                    break;


                default:
                    this->signo = "Faz certo faz favor";
            }
        }
};
        
int main(void) {

    Signos a;

    int mes, dia;

    std::cout << "Digite o mes: ";
    std::cin >> mes;
    a.setMes(mes);

    std::cout << "Digite o dia: ";
    std::cin >> dia;
    a.setDia(dia);

    a.verificarSigno();
    std::cout << "O signo eh: " << a.getSigno() << std::endl;

    return 0;
}