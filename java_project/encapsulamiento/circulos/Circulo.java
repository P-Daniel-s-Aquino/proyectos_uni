// Círculo
// Implementar una clase que modele un círculo, del que se desea manipular (obtener y cambiar):
// 
// radio
// diámetro
// perímetro
// área

package encapsulamiento.circulos;

import java.util.Scanner;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public void pedirRadio(Scanner teclado) {
        System.out.print("ingrese el radio: ");
        this.radio = teclado.nextDouble();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double diametro(){
        return radio * 2;
    }

    public double perimetro(){
        return radio * 2 * Math.PI;
    }

    public double area(){
        double rr = radio * radio;
        return rr * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("%n==============OBJETO==============%n" +
            "Radio : %.2f, diametro : %.3f, perimetro : %.4f, area : %.5f",
            getRadio(),
            diametro(),
            perimetro(),
            area()
            );
    }
}