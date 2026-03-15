package herencia.personas;

public class Consultor extends Persona {

    private String nombreConsultora;
    private int numConsultor;

    public Consultor() {

    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                    String nombreConsultora, int numConsultor) {

        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }

    @Override
    public String toString() {
        return String.format("%n==============DATOS CONSULTOR==============%n" +
            "id: %d%n" +
            "DNI: %s%n" +
            "Nombre: %s%n" +
            "Apellido: %s%n" +
            "Domicilio: %s%n" +
            "Telefono: %s%n" +
            "Nombre Consultora: %s%n" +
            "Numero de consutor: %d%n",
            // >>> Ahora los valores <<<
            this.getId(),       
            this.getDni(),      
            this.getNombre(),   
            this.getApellido(), 
            this.getDomicilio(),
            this.getTelefono(),
            this.nombreConsultora,
            this.numConsultor
        );
    }
}
