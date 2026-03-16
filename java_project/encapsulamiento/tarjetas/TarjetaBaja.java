// TarjetaBaja
// class TarjetaBaja {

//     /**
//      * post: saldo de la Tarjeta en saldoInicial.
//      */
//     public TarjetaBaja(double saldoInicial) { }

//     /**
//      * post: devuelve el saldo actual de la Tarjeta
//      */
//     public double obtenerSaldo() { } 

//     /**
//      * post: agrega el monto al saldo de la Tarjeta.
//      */
//     public void cargar(double monto) { }

//     /**
//      * pre : saldo suficiente.
//      * post: utiliza 21.50 del saldo para un viaje en colectivo.
//      */
//     public void pagarViajeEnColectivo() { }

//     /**
//      * pre : saldo suficiente.
//      * post: utiliza 19.50 del saldo para un viaje en subte. 
//      */
//     public void pagarViajeEnSubte() { }

//     /**
//      * post: devuelve la cantidad de viajes realizados.
//      */
//     public int contarViajes() { }

//     /**
//      * post: devuelve la cantidad de viajes en colectivo.
//      */
//     public int contarViajesEnColectivo() { }

//     /**
//      * post: devuelve la cantidad de viajes en subte.
//      */
//     public int contarViajesEnSubte() { }
// }

package encapsulamiento.tarjetas;

public class TarjetaBaja {

    private double saldoInicial;
    private int contColectivo = 0;
    private int contSubte = 0;

    public TarjetaBaja(double saldoInicial) {
        
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial() {

        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {

        this.saldoInicial = saldoInicial;
    }

    public void cargar(double monto) {

        this.saldoInicial += monto;
    }

    public void pagarViajeEnColectivo() {

        if(getSaldoInicial() < 21.50) {

            System.out.printf("El saldo es insuficiente, su saldo es %.2f$ %nDeberia superar los 21.50$%n", saldoInicial);
        } else {

            this.saldoInicial -= 21.50;
            contColectivo += 1;
        }
    }

    public void pagarViajeEnSubte() {

        if(getSaldoInicial() < 19.50) {

            System.out.printf("El saldo es insuficiente, su saldo es %.2f$ %nDeberia superar los 19.50$%n", saldoInicial);
        } else {

            this.saldoInicial -= 19.50;
            contSubte += 1;
        }
    }

    public int contarViajes() {

        return contColectivo + contSubte;
    }

    public int contarViajesEnColectivo() {

        return contColectivo;
    }

    public int contarViajesEnSubte() {

        return contSubte;
    }

    @Override
    public String toString() {
        return String.format("%n==============OBJETO==============%n" +
            "Saldo: %.2f$ %nviajes en colectivo: %d %nviajes en subte: %d %nviajes totales: %d", 
            getSaldoInicial(),
            contarViajesEnColectivo(),
            contarViajesEnSubte(),
            contarViajes()
        );
    }

}