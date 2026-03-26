package iniciales.Practica_POO2.arreglos;

public class Main {
    
    public static void main(String[] args) {
    
        int[] a1 = {1, -2, 3, 44, 60};
        int[] a2 = {11, -8, -90, -22, 22};

        Arreglo arr = new Arreglo(a2, a1);
        System.out.println(arr);
    }
}
