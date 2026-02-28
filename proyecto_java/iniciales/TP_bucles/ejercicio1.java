package iniciales.TP_bucles;

import java.util.Scanner;

// Escribir un programa que muestre el eco de todo
// lo que el usuario introduzca hasta que el usuario escriba "salir"

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "";

        while (!texto.equals("salir")){
            System.out.println("Ingrese texto: ");
            texto = teclado.nextLine();

            if (!texto.equals("salir")){
                System.out.println(texto);
            }
        }

        teclado.close();
    }
}
