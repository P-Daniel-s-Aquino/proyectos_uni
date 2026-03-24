package polimorfismo.sociedades;

public class Main {
    
    public static void main(String[] args) {
        
        Sociedad sc = new Sociedad("La sociedad", "calle falsa 123", 10000.50f, "20-203234-3");
        System.out.println(sc);

        SA sa = new SA("anonima", "sola 123", 1000000.43f, "22-234234-9", 12, 1112.3f, true, 22);
        System.out.println();
        System.out.println(sa);

        String[] socios = {"Juan perez", "Marina rodriguez", "sol perez"};
        float[] participacion = {50.54f, 22.45f, 89.98f};
        SH sh = new SH("central", "Guerrez 22", 2222.22f, "22-342444-2", socios, participacion);
        System.out.println();
        System.out.println(sh);

        SRL srl = new SRL("recurs", "falsa 234", 1200000.22f, "22-223443-3", 32);
        srl.agregarGerente("martin perez", 2332323.323f);
        srl.agregarGerente("martina gerez", 23323.3f);
        srl.agregarGerente("agsutina uubysz", 2445456.33f);

        System.out.println();
        System.out.println(srl);
        srl.agregarGerente("agsutin uuz", 246.3f);
        System.out.println();
        System.out.println(srl);
    }
}
