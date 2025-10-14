#include <stdio.h>
#include <string.h>

typedef struct {
    int id;
    char nome[30];
}Autor;

typedef struct{
    int id;
    char titulo[50];
    char editora[30];
    int ano;
    int numpag;
    Autor autor;
}Livro;


void imprime_informacoes(Livro a){
    printf("Id do livro: %i\n", a.id);
    printf("Titulo do livro: %s\n", a.titulo);
    printf("Editora do livro: %s\n", a.editora);
    printf("Ano do livro: %i\n", a.ano);
    printf("Numero de paginas do livro: %i\n", a.numpag);
    printf("Id do autor: %i\n", a.autor.id);
    printf("Nome do autor: %s\n", a.autor.nome);
}

int main(){

    Livro a1;

    a1.autor.id = 12345;
    strcpy(a1.autor.nome, "Gabriel");
    a1.id = 54321;
    strcpy(a1.titulo, "Trabalho");
    strcpy(a1.editora,"Ola");
    a1.ano = 2025;
    a1.numpag = 10;
    imprime_informacoes(a1);

}