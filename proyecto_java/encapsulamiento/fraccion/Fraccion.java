package encapsulamiento.fraccion;

// Fracción
// Definir una clase que represente a un número fraccionario. Una fracción está definida por un numerador 
// y un denominador, ambos son números enteros. La clase deberá contener:
// 
// un constructor por defecto que inicialice la fracción en la fracción nula: 0/1
// un constructor con dos parámetros: dos números enteros para inicializar el numerador y el denominador 
// de la fracción. Se deberá tener en cuenta que el denominador debe ser no nulo
// Los métodos set y get respectivos
// El método toString() / __str__()
// El método ftor (): convierte una fracción a número real
// El método reducir(): simplifica la fracción hasta que queda irreducible

public class Fraccion {
   
    private int numerador;
    private int denominador;

    public Fraccion() {

        this(0, 1);
    }

    public Fraccion(int numerador, int denominador) {
        
        this.numerador = numerador;
        
        if(denominador == 0) {
            System.err.println("El denominador no puede ser 0");
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    public int getNumerador() {

        return numerador;
    }

    public void setNumerador(int numerador) {

        this.numerador = numerador;
    }

    public int getDenominador() {

        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public float ftor() {

        return (float) this.numerador / this.denominador;
    }

    private int calcularMCD(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    /**
     * Reduce esta fracción a su mínima expresión.
     * El objeto actual es modificado.
     */
    public void reducir() {
        // 1. Calcula el MCD.
        int mcd = calcularMCD(this.numerador, this.denominador);

        // 2. Divide ambos por el MCD.
        this.numerador /= mcd;
        this.denominador /= mcd;
        
        // (Opcional) Manejar el signo: si el denominador es negativo, pasamos el signo al numerador.
        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    @Override
    public String toString() {

        Fraccion copiaReducida = new Fraccion(this.numerador, this.denominador);

        copiaReducida.reducir();
        /*
            Genero una copia para poder obtener los valores de numerador y denominador utilizables en el
            toString. Es una copia temporal para podere retornar dos cosas de un metodo
        */ 

        return String.format("%n==============OBJETO==============%n" +
            "Numerador: %d %nDenominador: %d %nFraccion: %d/%d %nReal: %.2f %nReducida: %d/%d", 
            this.numerador,
            this.denominador,
            this.numerador,
            this.denominador,
            this.ftor(),
            copiaReducida.numerador,
            copiaReducida.denominador
        );
    }
}
