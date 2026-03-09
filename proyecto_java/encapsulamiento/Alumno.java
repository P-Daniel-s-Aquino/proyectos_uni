package encapsulamiento;

// Estudiante
// Realizar un programa que conste de una clase llamada Estudiante, 
// que tenga como atributos el nombre y la nota del alumno. Definir los métodos 
// para inicializar sus atributos, imprimirlos y mostrar un mensaje con el resultado 
// de la nota y si ha aprobado o no

public class Alumno {

    String nombre;
    int nota;
    
    public Alumno(){                        // contructor vacio, java admite multiples constructores

    }

    public Alumno(String nombre, int nota){ // constructor inicializado con todos los atributos

        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarNombre(){

        System.out.println("Mi nombre es: " + this.nombre);
    }

    public int mostrarNota(){
        
        System.out.println(this.nota);
        return this.nota;
    }

    public boolean aprobado(){
        
        return this.nota > 6;
    }

    public void mostrar_aprobado(){

        if (aprobado()){
            
            System.out.println("Aprobado");
        } else {
            
            System.out.println("Desaprobado");
        }
    }

}
