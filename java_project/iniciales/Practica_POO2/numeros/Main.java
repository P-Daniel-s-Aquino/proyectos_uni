package iniciales.Practica_POO2.numeros;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al juego de adivinar el numero\n");
        System.out.println("El juego te dara pistas; si el numero que ingresaste es menor al secreto te dira que el numero es mas grande y viceversa...\n");

        Adivinar juego = new Adivinar(0, 1000);
        juego.iniciarJuego();
    }
}
