package iniciales.Practica_POO2.sumas_pares;

public class Main {
    
    public static void main(String[] args) {
        
        int[] numeros1 = {1, 2, 3, 3, 33, 44, 2, 2};
        Suma s1 = new Suma(numeros1);
        System.out.println(s1);

        int[] numeros2 = {22, 0, 33, 0, 11, 0, 44, 0, 55};
        Suma s2 = new Suma(numeros2);
        System.out.println(s2);
    }
}
