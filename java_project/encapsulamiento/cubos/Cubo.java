// Cubo
// Implementar la clase Cubo a partir de la siguiente interfaz:
// 
// constructor: inicializa el cubo a partir de la longitud de lado dada
// obtenerLado
// cambiarLado(double longitudLado): cambia la longitud de todos los lados del cubo
// obtenerAreaCara: devuelve el área de la superficie de las caras del cubo
// cambiarAreaCara(double areaCara): cambia el área de las caras del cubo
// obtenerVolumen: devuelve el volumen que encierra el cubo
// cambiarVolumen(double volumen): cambia el volumen del cubo

package encapsulamiento.cubos;

import java.util.Scanner;

public class Cubo {
    
    private double lado;

    public Cubo(){

    }

    public void obtenerLado(Scanner teclado){

        System.out.print("Ingrese el lado: ");
        this.lado = teclado.nextDouble();
    }
    

    public double getLado() {

        return lado;
    }

    public void setLado(double lado) {
  
        this.lado = lado;
    }

    public double obtenerAreaCara(){

        double ll = lado * lado;
        return ll; 
    }

    public void cambiarAreaCara(double area){

        this.lado = Math.sqrt(area);
    }

    public double obtenerVolumen(){

        double lll = obtenerAreaCara() * lado;
        return  lll;
    }

    public void cambiarVolumen(double volumen){

        this.lado = Math.cbrt(volumen);
    }

    @Override
    public String toString() {
        return String.format("%n==============OBJETO==============%n" +
            "Lado: %.2f, area de la cara: %.2f, volumen de la cara %.2f", 
            getLado(),
            obtenerAreaCara(),
            obtenerVolumen()
            );
    }
}
