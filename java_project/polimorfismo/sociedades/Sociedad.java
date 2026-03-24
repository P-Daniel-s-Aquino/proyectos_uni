package polimorfismo.sociedades;

// Sociedades
// Dada la siguiente jerarquia de clases:

// Sociedad Anónima es una Sociedad
// SRL es una Sociedad
// SH es una Sociedad
// Datos comunes: denominación social, domicilio legal, capital social, CUIT
// Datos adicionales según el tipo de sociedad:
// Sociedad Anónima: cantidad de acciones, precio de cada acción, cotiza en bolsa (s/n), cantidad de directores
// SRL: nombre de socios gerentes (máximo 3), patrimonio personal de cada socio gerente, cantidad de socios no gerentes
// SH: lista de los nombres de los socios, porcentaje de participación de cada socio
// Considerar que siempre una sociedad debe corresponder a algún tipo específico.
// Escribir los constructores y los métodos necesarios y adecuados. Escribir un programa usando el concepto de polimorfismo 
// que muestre en pantalla toda la información disponible de una sociedad. Escribir un método (y usarlo en el programa) que 
// permita comparar el capital de dos sociedades

public class Sociedad {
    
    private String denominacion_social;
    private String domicilio_legal;
    private float capital_social;
    private String cuit;
    
    public Sociedad(String denominacion_social, String domicilio_legal, float capital_social, String cuit) {
        this.denominacion_social = denominacion_social;
        this.domicilio_legal = domicilio_legal;
        this.capital_social = capital_social;
        this.cuit = cuit;
    }

    public String getDenominacion_social() {
        return denominacion_social;
    }

    public void setDenominacion_social(String denominacion_social) {
        this.denominacion_social = denominacion_social;
    }

    public String getDomicilio_legal() {
        return domicilio_legal;
    }

    public void setDomicilio_legal(String domicilio_legal) {
        this.domicilio_legal = domicilio_legal;
    }

    public float getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(float capital_social) {
        this.capital_social = capital_social;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return (
            "=============== SOCIEDAD ===============" +
            "\nDenominacion social: " + this.denominacion_social +
            "\nDomicilio legal: " + this.domicilio_legal +
            "\nCUIT: " + this.cuit +
            "\nCapital social: " + this.capital_social 
        );
    }
}
