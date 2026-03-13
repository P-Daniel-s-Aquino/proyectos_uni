package encapsulamiento.fraccion;

public class MainFraccion {
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(-15, -3);

        System.out.println(f1);

        f1.setNumerador(15);
        f1.setDenominador(-3);

        System.out.println(f1);

        System.out.printf("Fraccion: %d/%d %n",
            f2.getNumerador(), f2.getDenominador()
        );

        f2.reducir();

        System.out.printf("Reducida: %d/%d %n", 
            f2.getNumerador(),
            f2.getDenominador()
        );

        System.out.println(f2);
    }
}
