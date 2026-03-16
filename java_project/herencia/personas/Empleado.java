package herencia.personas;

public class Empleado extends Persona{
    
    private int numLegajo;
    private String cargo;
    private float sueldo;

    public Empleado() {

    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                    int numLegajo, String cargo, float sueldo) {

        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumLegajo() {

        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {

        this.numLegajo = numLegajo;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public float getSueldo() {

        return sueldo;
    }

    public void setSueldo(float sueldo) {
        
        this.sueldo = sueldo;
    }

  @Override
    public String toString() {
        return String.format("%n==============DATOS EMPLEADO==============%n" +
            "id: %d%n" +
            "DNI: %s%n" +
            "Nombre: %s%n" +
            "Apellido: %s%n" +
            "Domicilio: %s%n" +
            "Telefono: %s%n" + 
            "Nro Legajo: %d%n" +
            "Cargo: %s%n" +     
            "Sueldo: %.2f%n",   
            // --- Ahora los valores ---
            this.getId(),       
            this.getDni(),      
            this.getNombre(),   
            this.getApellido(), 
            this.getDomicilio(),
            this.getTelefono(),  
            this.numLegajo,      
            this.cargo,          
            this.sueldo
        );
    }
}
