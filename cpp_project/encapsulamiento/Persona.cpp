#include <iostream>
#include <ostream>

// Estudiante
// Realizar un programa que conste de una clase llamada Estudiante, 
// que tenga como atributos el nombre y la nota del alumno. Definir los métodos 
// para inicializar sus atributos, imprimirlos y mostrar un mensaje con el resultado 
// de la nota y si ha aprobado o no

using std::cout;
using std::endl;
using std::string;

class Estudiante{

    private:
        
        string nombre;
        int nota;

    public:

    Estudiante(string nombre, int nota){
        
        this->nombre = nombre;
        this->nota = nota;
    }

    public:

    void setNombre(string otro){
        
        nombre = otro;
    }

    void setNota(int otra){

        nota = otra;
    }

    string getNombre(){

        return nombre;
    }

    int getNota(){

        return nota;
    }

    void mostrarDatos(){
        cout << "El nombre del estudainte es: " << getNombre() << endl;
        cout << "Su nota es: " << getNota() << endl;
    }

    void aprobado(){

        cout << "El alumno :" << getNombre() << " tiene de nota: " << getNota() << endl;

        if(getNota() > 6){
        
            cout << "El alumno " << getNombre() << " esta aprobado." << endl;
        }else{

            cout << "El alumno " << getNombre() << " esta desaprobado." << endl;
        }
    }
};

int main(){
    
    Estudiante e1("Daniel", 8);

    e1.getNombre();
    e1.getNota();
    e1.mostrarDatos();
    e1.aprobado();
    
    e1.setNombre("daniela");
    e1.setNota(2);

    e1.getNombre();
    e1.getNota();
    e1.mostrarDatos();
    e1.aprobado();

    return 0;
};
