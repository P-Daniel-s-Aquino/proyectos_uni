package herencia.canciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCanciones {

    private ArrayList<Cancion> catalogo = new ArrayList<>();

    // Método privado de ayuda para validar la referencia.
    private boolean existeReferencia(int referencia) {
        for (Cancion cancion : catalogo) {
            if (cancion.getReferencia() == referencia) {
                return true;
            }
        }
        return false;
    }

    // El método 'crear' ahora RECIBE el Scanner como parámetro.
    public void crear(Scanner teclado) {
        System.out.println("\nCreando nueva canción clásica...");
        
        int ref;
        // Bucle para asegurar que la referencia sea única.
        while (true) {
            System.out.print("Referencia: ");
            ref = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            if (existeReferencia(ref)) {
                System.out.println("Error: ¡Esa referencia ya está en uso! Intente con otra.");
            } else {
                break; // La referencia es válida, salimos del bucle.
            }
        }
        
        // Pedimos el resto de los datos.
        System.out.print("Titulo: ");
        String titulo = teclado.nextLine();
        
        System.out.print("Album: ");
        String album = teclado.nextLine();

        System.out.print("Grupo: ");
        String grupo = teclado.nextLine();

        System.out.print("Instrumentos: ");
        String instrumentos = teclado.nextLine();
        
        // Creamos la instancia de la canción específica.
        Clasica nuevaCancion = new Clasica(ref, titulo, album, grupo, instrumentos);
        
        // Y la añadimos al catálogo.
        catalogo.add(nuevaCancion);
        
        System.out.println("¡Canción agregada exitosamente!");
    }

    public void listado() {
        System.out.println("\n--- LISTADO DE CANCIONES ---");
        if (catalogo.isEmpty()) {
            System.out.println("La base de datos está vacía.");
        }
        
        for (Cancion cancion : catalogo) {
            cancion.imprimirCancion();
        }
    }

    public void eliminar(int referencia) {
        Cancion cancionAEliminar = null;
        for (Cancion cancion : catalogo) {
            if (cancion.getReferencia() == referencia) {
                cancionAEliminar = cancion;
                break;
            }
        }

        if (cancionAEliminar != null) {
            catalogo.remove(cancionAEliminar);
            System.out.println("Canción con referencia " + referencia + " eliminada.");
        } else {
            System.out.println("No se encontró ninguna canción con esa referencia.");
        }
    }
}