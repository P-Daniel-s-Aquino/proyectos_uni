package encapsulamiento.persona;

// Persona
// Crea una clase Persona. Con atributos nombre y edad. Además, crear un método 
// cumpleaños, que aumente en 1 la edad de la persona cuando se invoque sobre un 
// objeto creado con Persona

public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){

        return nombre;
    }

    public int getEdad(){

        return edad;
    }

    public void setNombre(String otro){

        nombre = otro;
    }

    public void setEdad(int otro){

        edad = otro;
    }

    public void cumpleanios(){

        this.edad += 1;
    }

}


