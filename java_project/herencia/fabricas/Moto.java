package herencia.fabricas;

public class Moto extends Fabrica {

    public Moto(String color, double precio) {
        super(2, color, precio);
    }

    @Override
    public String toString() {
        return String.format("%n==============MOTO==============%n" +
            
            "Llantas: %d%n" +
            "Color: %s%n" +
            "Precio: %.2f%n",

            this.getLlantas(),
            this.getColor(),
            this.getPrecio()
        );
    }
}
