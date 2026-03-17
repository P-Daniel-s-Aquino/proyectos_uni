#include <iostream>
#include <iomanip>

using std::cout;
using std::endl;
using std::cin;

int main(){

    double cantidad, interes;
    int anios;

    cout << "=== CALCULADORA DE INVERSION ===" << endl;

    cout << "Cantidad a invertir: ";
    cin >> cantidad;

    cout << "Interes anual (%): ";
    cin >> interes;

    cout << "Numero de años: ";
    cin >> anios;

    double factor = 1 + interes / 100;

    cout << std::fixed << std::setprecision(2) << endl;

    for(int i = 1; i <= anios; i++){
        cantidad *= factor;
        cout << "Año " << i << ": $" << cantidad << endl;
    }

    return 0;
}