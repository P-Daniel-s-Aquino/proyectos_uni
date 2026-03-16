package encapsulamiento.tarjetas;

public class MainTarjetaBaja {
    
    public static void main(String[] args) {
        
        TarjetaBaja t1 = new TarjetaBaja(20);

        System.out.println(t1);
        t1.pagarViajeEnColectivo();
        
        t1.cargar(100);
        System.out.printf("Su saldo acutual es de: %.2f %n", t1.getSaldoInicial());
        t1.pagarViajeEnColectivo();
        
        System.out.printf("Su saldo acutual es de: %.2f %n", t1.getSaldoInicial());
        System.out.println(t1);

        t1.pagarViajeEnSubte();
        t1.pagarViajeEnSubte();
        t1.pagarViajeEnSubte();

        System.out.printf("Su saldo acutual es de: %.2f %n", t1.getSaldoInicial());
        System.out.println(t1);

        t1.pagarViajeEnColectivo();
        t1.pagarViajeEnColectivo();

        System.out.println(t1);
    }
}
