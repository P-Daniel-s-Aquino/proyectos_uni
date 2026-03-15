package encapsulamiento.puntos;

public class Main_punto {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(-1, 1);
        Punto p3 = new Punto(-10, 1);
        Punto p4 = new Punto(5, 5);
        Punto p5 = new Punto(1, 1);
        

        System.out.println(p1.esElOrigenDeCoordenadas());
        System.out.println(p2.esElOrigenDeCoordenadas());
        System.out.println(p3.esElOrigenDeCoordenadas());
        System.out.println(p4.esElOrigenDeCoordenadas());
        System.out.println(p5.esElOrigenDeCoordenadas());
        
        System.out.println(p1.distanciaAlOrigen());
        System.out.println(p2.distanciaAlOrigen());
        System.out.println(p3.distanciaAlOrigen());
        System.out.println(p4.distanciaAlOrigen());
        System.out.println(p5.distanciaAlOrigen());
        
    }
}
