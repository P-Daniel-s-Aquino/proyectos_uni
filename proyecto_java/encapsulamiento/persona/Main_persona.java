package encapsulamiento.persona;

public class Main_persona {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Daniel", 26);

        p1.cumpleanios();
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getClass());

        p1.setEdad(12);
        p1.cumpleanios();
        System.out.println(p1.getEdad());
    }
}
