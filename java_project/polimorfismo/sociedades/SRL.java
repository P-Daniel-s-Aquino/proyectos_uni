package polimorfismo.sociedades;

import java.util.ArrayList;

public class SRL extends Sociedad{
    
    private static class SocioGerente {

        String nombre;
        float patrimonio;
        public SocioGerente(String nombre, float patrimonio) {
            this.nombre = nombre;
            this.patrimonio = patrimonio;
        }

        @Override
        public String toString() {
            return (
                "Nombre: " + this.nombre +
                " Patrimonio: " + this.patrimonio
            );
        }
    }

    private ArrayList<SocioGerente> socios_gerentes;
    private int cant_socios_no_gerentes;

    // 3. CORRECCIÓN: El constructor ya no pide los gerentes, se agregan después.
    public SRL(String denominacion_social, String domicilio_legal, float capital_social, String cuit, int cant_socios_no_gerentes) {
        super(denominacion_social, domicilio_legal, capital_social, cuit);
        this.cant_socios_no_gerentes = cant_socios_no_gerentes;
        // 4. CORRECCIÓN: ¡Inicializamos la lista! Ya no es null.
        this.socios_gerentes = new ArrayList<>();
    }

    public ArrayList<SocioGerente> getSocios_gerentes() {
        return socios_gerentes;
    }

    public void setSocios_gerentes(ArrayList<SocioGerente> socios_gerentes) {
        this.socios_gerentes = socios_gerentes;
    }

    public int getCant_socios_no_gerentes() {
        return cant_socios_no_gerentes;
    }

    public void setCant_socios_no_gerentes(int cant_socios_no_gerentes) {
        this.cant_socios_no_gerentes = cant_socios_no_gerentes;
    }

    public void agregarGerente(String nombre, float patrimonio) {
        // La validación se hace aquí, al momento de agregar.
        if (this.socios_gerentes.size() >= 3) {
            System.out.println("Error: Límite de 3 gerentes alcanzado. No se puede agregar a " + nombre);
            return; 
        }
        this.socios_gerentes.add(new SocioGerente(nombre, patrimonio));
        System.out.println("Gerente '" + nombre + "' agregado.");
    }

    public void eliminarGerente(String nombre) {
        boolean fueEliminado = this.socios_gerentes.removeIf(gerente -> gerente.nombre.equalsIgnoreCase(nombre));
        if (fueEliminado) {
            System.out.println("Gerente '" + nombre + "' eliminado.");
        } else {
            System.out.println("No se encontró al gerente '" + nombre + "'.");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n--- Info SRL ---");
        sb.append("\nCantidad Socios no Gerentes: ").append(this.cant_socios_no_gerentes);
        sb.append("\nSocios Gerentes (" + this.socios_gerentes.size() + " de 3):");
        
        if (this.socios_gerentes.isEmpty()) {
            sb.append("\n  (No hay gerentes asignados)");
        } else {
            for (SocioGerente gerente : this.socios_gerentes) {
                sb.append("\n  - ").append(gerente.toString());
            }
        }
        return sb.toString();
    }
}