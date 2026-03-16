package herencia.fabricas;

// Fabricas
// Crear una clase Fabrica que tenga los atributos de Llantas, Color y Precio. 
// Luego crear dos clases más que hereden de Fabrica, las cuales son Moto y Auto. 
// Crear métodos que muestren la cantidad de llantas, color y precio de ambos transportes. 
// Por último, crear objetos para cada clase y mostrar por pantalla los atributos de cada uno

public class Fabrica {
    
    private int llantas;
    private String color;
    private double precio;

    public Fabrica() {

    }

    public Fabrica(int llantas, String color, double precio) {

        this.llantas = llantas;
        this.color = color;
        this.precio = precio;
    }

    public int getLlantas() {

        return llantas;
    }

    public void setLlantas(int llantas) {

        this.llantas = llantas;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {
        
        this.precio = precio;
    }

        
}
