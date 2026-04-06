package iniciales.Practica_POO2.consonantes;

public class Consonante {
    
    String mensaje;

    public Consonante() {
        this("Hola como estas?");
    }

    public Consonante(String mensaje) {
        this.mensaje = mensaje;
    }

    public String sinVocales() {
        
        String consonantes = "";

        for(int i = 0; i < mensaje.length(); i += 1) {
            char letraActual = mensaje.charAt(i);
            char letraMinuscula = Character.toLowerCase(letraActual);

            if (letraMinuscula != 'a' && 
            letraMinuscula != 'e' && 
            letraMinuscula != 'i' && 
            letraMinuscula != 'o' && 
            letraMinuscula != 'u') 
            {
                consonantes += letraActual;
            }
        }
        return consonantes;
    }

    public String devolverConsonantes() {
        return this.mensaje.replaceAll("[aeiou]", "");
    }
}
