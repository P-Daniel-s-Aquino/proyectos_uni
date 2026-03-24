package polimorfismo.sociedades;

public class SA extends Sociedad{
    
    int cantidad_acciones;
    float precio_accion;
    boolean cotiza_bolsa = false;
    int cant_directores;
    
    public SA(String denominacion_social, String domicilio_legal, float capital_social, String cuit,
            int cantidad_acciones, float precio_accion, boolean cotiza_bolsa, int cant_directores) {
        super(denominacion_social, domicilio_legal, capital_social, cuit);
        this.cantidad_acciones = cantidad_acciones;
        this.precio_accion = precio_accion;
        this.cotiza_bolsa = cotiza_bolsa;
        this.cant_directores = cant_directores;
    }

    public int getCantidad_acciones() {
        return cantidad_acciones;
    }

    public void setCantidad_acciones(int cantidad_acciones) {
        this.cantidad_acciones = cantidad_acciones;
    }

    public float getPrecio_accion() {
        return precio_accion;
    }

    public void setPrecio_accion(float precio_accion) {
        this.precio_accion = precio_accion;
    }

    public boolean isCotiza_bolsa() {
        return cotiza_bolsa;
    }

    public void setCotiza_bolsa(boolean cotiza_bolsa) {
        this.cotiza_bolsa = cotiza_bolsa;
    }

    public int getCant_directores() {
        return cant_directores;
    }

    public void setCant_directores(int cant_directores) {
        this.cant_directores = cant_directores;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            "\n--------- info. S.A. ---------" +
            "\nCantidad de acciones: " + this.cantidad_acciones +
            "\nPrecio por accion: " + this.precio_accion +
            "\nCotiza en bolsa: " + this.cotiza_bolsa +
            "\ncantidad de Directores: " + this.cant_directores
        );
    }
}
