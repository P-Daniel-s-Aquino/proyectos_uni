package herencia.fabricas;

public class MainFabrica {
    
    public static void main(String[] args) {
        
        Moto m1 = new Moto("negro", 125000.75);

        System.out.println(m1);

        Auto a1 = new Auto("rojo", 2223244.32);

        System.out.println(a1);
    }
}
