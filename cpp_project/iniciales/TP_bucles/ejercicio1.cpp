// Escribir un programa que muestre el eco de todo
// lo que el usuario introduzca hasta que el usuario escriba "salir"

#include <iostream>
#include <string>

using std::cout;
using std::endl;
using std::cin;
using std::string;
using std::getline;

int main(){
    
    string texto;

    cout << "Ingrese un texto: " << endl;
    getline(cin, texto);

    while(texto != "salir"){
        
        cout << texto << endl;
        
        cout << "Ingrese un texto: " << endl;
        getline(cin, texto);
        cout << "saliendo del programa...";
    }

    return 0;
}