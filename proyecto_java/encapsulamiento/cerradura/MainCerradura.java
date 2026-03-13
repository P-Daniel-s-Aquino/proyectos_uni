package encapsulamiento.cerradura;

public class MainCerradura {
    
    public static void main(String[] args) {
        
        Cerradura c1 = new Cerradura(2222, 4);

        c1.abrir(222);
        System.out.printf("Esta abierta %b%n", c1.estaAbierta());
        System.out.printf("Esta cerrada %b%n", c1.estaCerrada());
        System.out.printf("Esta bloqueada %b%n", c1.fueBloqueada());

        System.out.println(c1);

        c1.abrir(221);
        System.out.println(c1);

        c1.abrir(2222);
        System.out.println(c1);

        c1.cerrar();
        System.out.println(c1);

        c1.setCantidadDeFallosConsecutivosQueLaBloquean(2);
        
        c1.abrir(221);
        System.out.println(c1);
       
        c1.abrir(222);
        System.out.println(c1);
    }
}
