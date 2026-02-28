// Escribir un programa que pregunte al usuario una cantidad a invertir,
// el interés anual y el número de años, y muestre por pantalla el
// capital obtenido en la inversión cada año que dura la inversión

#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int main(){
    
    double cantidad, intereses, porcen;
    int anios;

    cout << "Ingrese la cantidad a invertir: ";
    cin >> cantidad;
    cout << "Ingrese el interes anual: ";
    cin >> intereses;
    cout << "Ingrese el numero de años: ";
    cin >> anios;

    porcen = (intereses / 100) + 1;

    for(int i = 0; i <= anios - 1; i += 1){
        cantidad *= porcen;
        cout << "El " << i + 1 << "° año se recaudó " << cantidad << endl;
    }
    return 0;
}