#include <stdio.h>
#include <math.h>

float velocidade(float distancia, float tempo){

    float vel;

    vel = distancia / tempo;

    return vel;
}

float distanciaEntrePontos(int x1, int x2, int y1, int y2){

    float distan;

    distan = sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

    return distan;

    
}