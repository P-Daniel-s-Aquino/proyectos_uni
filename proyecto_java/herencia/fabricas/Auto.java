package herencia.fabricas;

public class Auto extends Fabrica {

    public Auto(String color, double precio) {
        super(4, color, precio);
    }
    
    @Override
    public String toString() {
        return String.format("%n==============AUTO==============%n" +
            
            "Llantas: %d%n" +
            "Color: %s%n" +
            "Precio: %.2f%n",

            this.getLlantas(),
            this.getColor(),
            this.getPrecio()
        );
    }
}
