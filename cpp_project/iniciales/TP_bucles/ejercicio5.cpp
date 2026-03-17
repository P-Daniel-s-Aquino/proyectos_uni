// Escribir un programa que pida al usuario un número entero positivo
// y muestre por pantalla la cuenta atrás desde ese número hasta cero 
// separados por comas

#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int main(){
    int numero;
    cout << "Ingrese un numero positivo: " << endl;
    cin >> numero;

    for(int i = numero; i >= 0; i -= 1){
        if(i - 1 < 0){
            cout << i << ".";
        }
        else{
            cout << i << ", ";
        }
    }

    return 0;
}

