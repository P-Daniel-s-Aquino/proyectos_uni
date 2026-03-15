package encapsulamiento.puntos;

// Punto
// Crear la clase Punto que tendrá dos atributos numéricos, x e y, que 
// representarán las coordenadas del punto dentro del plano. Implemente los siguientes métodos:
// estaSobreElEjeX(): devuelve valor booleano
// estaSobreElEjeY(): devuelve valor boolean
// esElOrigenDeCoordenadas(): devuelve valor booleano
// distanciaAlOrigen(): devuelve valor numérico
// distancia(Punto p1, Punto p2): devuelve valor numérico
// distancia(Punto p): devuelve valor numérico

public class Punto {

    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean estaSobreElEjeX(){

        return this.y == 0; 
    }

    public boolean estaSobreElEjeY(){

        return this.x == 0;
    }

    public boolean esElOrigenDeCoordenadas(){

        return this.x == 0 && this.y == 0;
    }

    public double distanciaAlOrigen(){

        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static Double distancia(Punto p1, Punto p2){

        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }

    public double distancia(Punto otro){

        return Math.sqrt(Math.pow((this.x - otro.x), 2) + Math.pow((this.y - otro.y), 2));
    }

    @Override
    public String toString() {
        return "Punto [x = " + getX() + ", y = " + getY() + "]";
    }
    
}
