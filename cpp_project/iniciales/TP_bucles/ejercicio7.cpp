// Escribir un programa que pida al usuario un número entero y
// muestre por pantalla un triángulo rectángulo como el de más abajo,
// de altura el número introducido

#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int main() {
    int numero;

    cout << "Ingrese un numero entero: ";
    cin >> numero;

    for (int i = 1; i <= numero; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}