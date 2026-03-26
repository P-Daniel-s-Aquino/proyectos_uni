package iniciales.Practica_POO2.arreglos;

import java.util.Arrays;

public class Arreglo {
    
    private int[] enteros1;
    private int[] enteros2;
    
    public Arreglo(int[] enteros1, int[] enteros2) {
        this.enteros1 = enteros1;
        this.enteros2 = enteros2;
    }

    public int[] getEnteros1() {
        return enteros1;
    }

    public void setEnteros1(int[] enteros1) {
        this.enteros1 = enteros1;
    }

    public int[] getEnteros2() {
        return enteros2;
    }

    public void setEnteros2(int[] enteros2) {
        this.enteros2 = enteros2;
    }

    public int[] ordenarArreglos(int[] enteros1, int[] enteros2) {
        
        int tam_total = enteros1.length + enteros2.length;
        int[] concatenado = new int[tam_total];
        
        for(int i = 0; i < enteros1.length; i += 1){
            concatenado[i] = enteros1[i];
        } 
        
        for(int i = 0; i < enteros2.length; i += 1) {
            concatenado[enteros1.length + i] = enteros2[i];
        }
        
        Arrays.sort(concatenado);
        return concatenado;
    }

    @Override
    public String toString() {
        return (
            "=============== ARREGLOS ===============" +
            "\nArreglo 1: " + Arrays.toString(this.enteros1) +
            "\nArreglo 2: " + Arrays.toString(this.enteros2) +
            "\nArreglo Ordenado: " + Arrays.toString(this.ordenarArreglos(this.enteros1, this.enteros2))
        );
    }
}
