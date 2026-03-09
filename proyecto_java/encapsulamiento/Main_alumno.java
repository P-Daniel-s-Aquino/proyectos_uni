package encapsulamiento;

public class Main_alumno {
    
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Daniel", 8);
        Alumno a2 = new Alumno();

        a1.mostrarNombre();
        a1.mostrarNota();
        a1.mostrar_aprobado();
        System.out.println(a1.aprobado());

        System.out.println();
        
        a2.mostrarNombre();
    }
}
