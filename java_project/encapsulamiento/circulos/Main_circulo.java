package encapsulamiento.circulos;

import java.util.Scanner;

public class Main_circulo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Circulo c1 = new Circulo(25);

        System.out.println("El radio es: "+ c1.getRadio() +" unidades");
        System.out.println("El area es: " + c1.area());
        System.out.printf("El area es: %.1f unidades%n", c1.area());
        System.out.printf("El perimetro es %.2f unidades%n", c1.perimetro());
        System.out.println(c1);

        Circulo c2 = new Circulo();

        c2.pedirRadio(teclado);
        System.out.println(c2);
        System.out.printf("El area es %.2f%n", c2.area());

        teclado.close();
    }
}
