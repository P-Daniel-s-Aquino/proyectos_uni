// Cuando una Cerradura se bloquea no puede volver a abrirse nunca más
// class Cerradura {
// 
//    public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean)
// 
    // public boolean abrir(int clave)
// 
    // public void cerrar()
// 
    // public boolean estaAbierta()
// 
    // public boolean estaCerrada()
// 
    // public boolean fueBloqueada()
// 
    // public int contarAperturasExitosas()
// 
    // public int contarAperturasFallidas()
// 
// }

package encapsulamiento.cerraduras;

public class Cerradura {
    
    private int claveDeApertura;
    private int cantidadDeFallosConsecutivosQueLaBloquean;
    private int fallos = 0;
    private boolean abierta = false;
    private boolean bloqueada = false;
    private int aperturasExitosas = 0;
    private int aperturasFallidas = 0;

    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {

        this.claveDeApertura = claveDeApertura;
        this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    }

    public int getClaveDeApertura() {

        return claveDeApertura;
    }

    public void setClaveDeApertura(int claveDeApertura) {

        this.claveDeApertura = claveDeApertura;
    }

    public int getCantidadDeFallosConsecutivosQueLaBloquean() {

        return cantidadDeFallosConsecutivosQueLaBloquean;
    }

    public void setCantidadDeFallosConsecutivosQueLaBloquean(int cantidadDeFallosConsecutivosQueLaBloquean) {

        this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    }
    
    public boolean abrir(int clave) {

        if(bloqueada) {
            return false;
        }

        if(clave == claveDeApertura) {

            abierta = true;
            fallos = 0;
            aperturasExitosas += 1;
            return true;
        }

        fallos += 1;
        aperturasFallidas += 1;

        if(fallos >= cantidadDeFallosConsecutivosQueLaBloquean) {
            bloqueada = true;
        }

        return false;
    }

    public void cerrar() {

        if(abierta) {
            abierta = false;
        }
    }

    public boolean estaAbierta() {

        return abierta;
    }

    public boolean estaCerrada() {

        return !abierta;
    }

    public boolean fueBloqueada() {

        return bloqueada;
    }

    public int contarAperturasExitosas() {

        return aperturasExitosas;
    }

    public int contarAperturasFallidas() {

        return aperturasFallidas;
    }

    @Override
    public String toString() {
        return String.format("%n==============ESTADOS DE LA CERRADURA==============%n" +
            "Abierta: %b %nCerrada: %b %nBloqueada: %b %nIntentos: %d %nIntentos restantes: %d", 
            estaAbierta(),
            estaCerrada(),
            fueBloqueada(),
            fallos,
            cantidadDeFallosConsecutivosQueLaBloquean - fallos
        );
    }
}
