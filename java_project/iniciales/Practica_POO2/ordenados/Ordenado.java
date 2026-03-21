package iniciales.Practica_POO2.ordenados;

// Escrbir un metodo que reciba una lista de enteros y determine si estan ordenados o no.
import java.util.Arrays;

public class Ordenado {
    
    private int enteros[];

    public Ordenado(int[] enteros) {
        this.enteros = enteros;
    }

    public int[] getEnteros() {
        return enteros;
    }

    public void setEnteros(int[] enteros) {
        this.enteros = enteros;
    }

    public boolean estaOrdenado() {
        if(enteros.length <= 1){
            return true;
        }
        
        for(int i = 0; i < enteros.length - 1; i += 1) {
            if(enteros[i] > enteros[i + 1]){
                return false;
            }
        }

        return true;
    }

   @Override
   public String toString() {
        return (
            "\n=============== ORDENADO ===============\n" +
            "Lista: " + Arrays.toString(this.enteros) +
            "\nOrdenado?: " + this.estaOrdenado()
        );
   }
    
}
