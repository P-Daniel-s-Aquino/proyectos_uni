// Decimal a binario
// Escribir una función que convierta un número decimal en binario y otra que convierta un número binario en decimal


#include <iostream>
#include <string>
#include <algorithm>

using std::cout;
using std::cin;
using std::endl;
using std::string;

string decimalABinario(int num) {
    if (num == 0) return "0";

    string binario = "";

    while (num > 0) {
        int resto = num % 2;
        binario += char(resto + '0'); // convierte a caracter
        num /= 2;
    }

    std::reverse(binario.begin(), binario.end());
    return binario;
}

int binarioADecimal(const string& bin) {
    int decimal = 0;
    int potencia = 1;

    for (int i = bin.size() - 1; i >= 0; i -= 1) {
        decimal += (bin[i] - '0') * potencia;
        potencia *= 2;
    }

    return decimal;
}

bool esBinario(const string& bin) {
    for (char c : bin) {
        if (c != '0' && c != '1')
            return false;
    }
    return true;
}

int main() {
    int num_dec;
    string num_bin;

    cout << "Ingrese un numero en decimal: ";
    cin >> num_dec;

    cout << "En binario: " << decimalABinario(num_dec) << endl;

    cout << "Ingrese un numero en binario: ";
    cin >> num_bin;

    if (esBinario(num_bin)) {
        cout << "En decimal: " << binarioADecimal(num_bin) << endl;
    } else {
        cout << "Error: no es un numero binario" << endl;
    }

    return 0;
}