package iniciales.Practica_POO2.numeros;

// Escribir un programa que genere un número entero aleatorio entre 0 y 1000 y le pida
// al usuario que lo adivine, si el usuario acierta debe responder con la cantidad de
// intentos y si el usuario no quiere continuar adivinando debe ingresar '*' y entonces
// debe mostrar cuál era el número.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivinar {

    private int min;
    private int max;
    private int numeroSecreto;
    private int intentos;
    private boolean juegoTerminado;

    public Adivinar(int min, int max) {
        this.min = min;
        this.max = max;
        // Generamos el número secreto tan pronto como se crea el objeto.
        // Usamos max + 1 para que el valor máximo sea incluido.
        this.numeroSecreto = ThreadLocalRandom.current().nextInt(min, max + 1);
        this.intentos = 0;
        this.juegoTerminado = false;
        System.out.println("(Pista para el desarrollador: el número es " + this.numeroSecreto + ")");
    }

    public int getMin() {
        return min;
    }
   
    public void setMin(int min) {
        this.min = min;
    }
   
    public int getMax() {
        return max;
    }
   
    public void setMax(int max) {
        this.max = max;
    }

    public void iniciarJuego() {
        Scanner teclado = new Scanner(System.in);

        while (!this.juegoTerminado) {
            pedirEntrada(teclado); // Le pasamos el Scanner al método.
        }

        teclado.close(); // Se cierra el Scanner al final de todo el juego.
        System.out.println("--- Fin del juego ---");
    }

    private void pedirEntrada(Scanner teclado) {
        System.out.print("Adivina el número (o ingresa '*' para rendirte): ");
        String entradaUsuario = teclado.next();

        this.intentos += 1; 

        if (entradaUsuario.equals("*")) {
            rendirse();
        } else {
            int numeroIngresado = Integer.parseInt(entradaUsuario);
            comprobarNumero(numeroIngresado);
        }
    }

    private void comprobarNumero(int numeroIngresado) {
        if (numeroIngresado == this.numeroSecreto) {
            System.out.println("¡Felicidades! ¡Encontraste el número en " + this.intentos + " intentos!");
            this.juegoTerminado = true;
        } else {
            if (numeroIngresado < this.numeroSecreto) {
                System.out.println("Incorrecto... el número secreto es MÁS ALTO.");
            } else {
                System.out.println("Incorrecto... el número secreto es MÁS BAJO.");
            }
        }
    }

    private void rendirse() {
        System.out.println("Te rendiste...");
        System.out.println("El número secreto era: " + this.numeroSecreto);
        this.juegoTerminado = true;
    }
}
