package encapsulamiento.cubos;

import java.util.Scanner;

public class Main_cubo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Cubo c1 = new Cubo();

        c1.obtenerLado(teclado);
        System.out.printf("El area esde la cara es %.5f unidades cuadradas%n", c1.obtenerAreaCara());
        System.out.printf("El volumen de la cara es %.5f unidades cubicas%n", c1.obtenerVolumen());

        c1.cambiarAreaCara(16);
        System.out.printf("El lado es: %.5f%n", c1.getLado());
        System.out.printf("El area esde la cara es %.5f unidades cuadradas%n", c1.obtenerAreaCara());
        System.out.printf("El volumen de la cara es %.5f unidades cubicas%n", c1.obtenerVolumen());

        System.out.println(c1);

        Cubo c2 = new Cubo();
        c2.cambiarVolumen(32.2);
        System.out.println(c2);
        System.out.printf("El lado es: %.5f%n", c2.getLado());
        System.out.printf("El area esde la cara es %.5f unidades cuadradas%n", c2.obtenerAreaCara());
        System.out.printf("El volumen de la cara es %.5f unidades cubicas%n", c2.obtenerVolumen());

        teclado.close();
    }
}
