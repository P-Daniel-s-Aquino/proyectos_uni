package polimorfismo.sociedades;

public class SH extends Sociedad { // Hereda de Sociedad

    // --- ATRIBUTOS ---
    // Dos arrays simples, como pediste.
    private String[] nombres_socios;
    private float[] porcentajes_participacion;

    /**
          * Constructor de la Sociedad de Hecho.
          * @param nombres_socios Un array con los nombres de los socios.
          * @param porcentajes_participacion Un array con sus porcentajes.
     */
    public SH(String denominacion_social, String domicilio_legal, float capital_social, String cuit,
              String[] nombres_socios, float[] porcentajes_participacion) {
        
        // 1. Llamamos al constructor del padre.
        super(denominacion_social, domicilio_legal, capital_social, cuit);

        // 2. Validación CRÍTICA: ¡Deben tener el mismo tamaño!
        // No podemos tener 3 nombres y solo 2 porcentajes, sería un error.
        if (nombres_socios.length!= porcentajes_participacion.length) {
            throw new IllegalArgumentException("Error: La cantidad de socios debe ser igual a la cantidad de porcentajes.");
        }

        // 3. Asignamos los valores a los atributos de esta clase.
        this.nombres_socios = nombres_socios;
        this.porcentajes_participacion = porcentajes_participacion;
    }

    // --- GETTERS Y SETTERS ---
    // Métodos para obtener y establecer los valores desde fuera.

    public String[] getNombres_socios() {
        return nombres_socios;
    }

    public void setNombres_socios(String[] nombres_socios) {
        this.nombres_socios = nombres_socios;
    }

    public float[] getPorcentajes_participacion() {
        return porcentajes_participacion;
    }

    public void setPorcentajes_participacion(float[] porcentajes_participacion) {
        this.porcentajes_participacion = porcentajes_participacion;
    }

    // --- TOSTRING ---
    // El método para mostrar toda la información.
    @Override
    public String toString() {
        // Empezamos con la info del padre (Sociedad).
        String resultado = super.toString();
        
        resultado += "\n--- Info SH ---";
        resultado += "\nSocios y Participación:";
        
        // Hacemos un bucle para recorrer los arrays.
        // Usamos nombres_socios.length porque ambos tienen el mismo tamaño.
        for (int i = 0; i < this.nombres_socios.length; i++) {
            // Para cada posición "i", tomamos el nombre y el porcentaje.
            String nombre = this.nombres_socios[i];
            float porcentaje = this.porcentajes_participacion[i];
            
            // Y lo añadimos al resultado.
            resultado += "\n - Socio: " + nombre + ", Participación: " + porcentaje + "%";
        }
        
        return resultado;
    }
}