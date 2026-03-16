// Escribir un programa que pida al usuario un número entero positivo
// y muestre por pantalla todos los números impares desde 1 hasta
// ese número separados por comas

#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int main(){

    int numero; 

    cout << "Ingrese un numero entero positivo: " << endl;
    cin >> numero;
    cout << "" << endl;
    
    for(int i = 1; i <= numero; i += 2){
        if(i + 2 > numero){
            cout << i << ".";
        }
        else{
            cout << i << ", ";
        }
    }

    return 0;
}