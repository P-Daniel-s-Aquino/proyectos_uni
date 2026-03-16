package herencia.personas;

public class MainPersona {
    
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(2321, "41.898.989", "Alfredo", 
                                   "Rodriguez", "Lavalle 2122", 
                                   "21-2222-2222", 1222, "TEC", 
                                   212323     
        ); 

        System.out.println(e1);

        Consultor c1 = new Consultor(2321, "42.422.232", "Monica",
                                    "Perez", "Llavallol 2", 
                                    "22-3233-3434", "Ni idea srl", 
                                    2204
        );

        System.out.println(c1);

        Consultor c2 = new Consultor();

        c2.setApellido("Gutierrez");
        c2.setNumConsultor(2232);
        c2.setDni("22.232.232");

        System.out.println(c2);

        System.out.printf("El nombre del consultor es:  %s y su id es: %d", c2.getNombre(), c2.getId());
    }
}
