package iniciales.Practica_POO2.sumas_pares;

// Escribir un método que reciba un arreglo de enteros y devuelva la suma de los
// elementos que se encuentran en posiciones pares (incluido el elemento de la posición 0). Por ejemplo:
// Dado el arreglo [1, 2, 13 ,4, 8, 6] devuelve 22 (1+13+8)

import java.util.Arrays;

public class Suma {
    
    private int[] num;
    private int sum = 0;

    public Suma(int[] num) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int sumar() {
        for(int n = 0; n < num.length; n += 2) {
            sum += num[n]; 
        }
        return sum;
    }

    @Override
    public String toString() {
        return (
            "\n=============== SUMA DE POSICIONES PARES ===============" +
            "\nLista: " + Arrays.toString(this.num) +
            "\nSuma de posiciones pares: " + this.sumar()
        );
    }
}
