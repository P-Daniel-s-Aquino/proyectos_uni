// Sumar los 10 primeros números naturales (1 + 2 + 3 + 4 + … + 10), 
// imprimiendo por cada suma el resultado parcial obtenido

#include <iostream>

using std::cout;
using std::endl;

int main(){

    int j = 0;

    for(int i = 1; i <= 10; i += 1){
        
        j += i;
        cout << j << endl;
    }

    return 0;
}