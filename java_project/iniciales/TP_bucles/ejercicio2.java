package iniciales.TP_bucles;

// Sumar los 10 primeros números naturales (1 + 2 + 3 + 4 + … + 10), 
// imprimiendo por cada suma el resultado parcial obtenido

public class ejercicio2 {
    public static void main(String[] args) {
        int j = 0;

        for(int i = 1; i < 11; i += 1){
            j += i;
            System.out.println(j);
        }
    }
}
