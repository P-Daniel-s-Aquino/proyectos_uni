package iniciales.TP_bucles;

import java.util.Scanner;

// Escribir un programa que pida al usuario un número entero positivo
// y muestre por pantalla todos los números impares desde 1 hasta
// ese número separados por comas

public class ejercicio4 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = teclado.nextInt();
        System.out.println();

        for(int i = 1; i <= numero; i += 2){
    
            if(i + 2 > numero){
                System.out.print(i + ".");    
            }            
            else{
                System.out.print(i + ", ");
            }
            
        }
    teclado.close();
   } 
}
