package iniciales.Practica_POO2.ordenados;

public class Main {
    public static void main(String[] args) {
        
        int[] numeros1 = {1, 2, 3, 3, 22, 202, 1000, 90};
        Ordenado o1 = new Ordenado(numeros1);

        System.out.println(o1.estaOrdenado());
        System.out.println(o1);

        int[] numeros2 = {1, 11, 212, 222};
        Ordenado o2 = new Ordenado(numeros2);
        System.out.println(o2);
    }

}
