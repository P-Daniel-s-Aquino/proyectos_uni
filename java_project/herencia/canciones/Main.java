package herencia.canciones;

import java.util.Scanner;

// Canciones
// Construir una pequeña base de datos de canciones clásicas en CD. Para ello se debe definir una clase base Canción, 
// de la cual descenderán todas las demás (clásica, pop, jazz, etc.). 
// Nosotros solo implementaremos la clase Clásica. La clase abstracta Canción tendrá cuatro atributos:
// número de referencia: identifica el CD de música, único para cada CD
// titulo: nombre de la canción
// álbum: nombre del disco
// grupo: nombre del grupo que toca la canción
// método abstract imprimirCancion() La clase Clásica hereda de Canción. Esta clase tendrá solo una variable adicional: 
// instrumentos(String), que pondrá el tipo de instrumentos que se usan. Funcionalidades permitidas:
// crear(): permite agregar una nueva canción
// eliminar(): borrar una canción, dado su número de referencia
// listado(): mostrar todas las canciones de la base de datos

public class Main {
    public static void main(String[] args) {
        
        // 1. Creamos una instancia del gestor del catálogo.
        ListaCanciones miCatalogo = new ListaCanciones();
        // Creamos un ÚNICO Scanner para toda la aplicación.
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        // 2. Bucle principal del menú.
        while (!salir) {
            System.out.println("\n===== MENÚ DEL CATÁLOGO MUSICAL =====");
            System.out.println("1. Agregar nueva canción clásica");
            System.out.println("2. Listar todas las canciones");
            System.out.println("3. Eliminar una canción por referencia");
            System.out.println("4. Salir");
            System.out.print("   Elija una opción: ");
            
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            // 3. El 'main' DELEGA la tarea al objeto 'miCatalogo'.
            switch (opcion) {
                case 1:
                    // Le pasamos el Scanner al método 'crear'.
                    miCatalogo.crear(teclado);
                    break;
                case 2:
                    // Corregido el nombre de la variable.
                    miCatalogo.listado();
                    break;
                case 3:
                    System.out.print("   > Ingrese la referencia de la canción a eliminar: ");
                    int refEliminar = teclado.nextInt();
                    miCatalogo.eliminar(refEliminar);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        System.out.println("\n¡Gracias por usar el catálogo musical!");
        // Cerramos el Scanner aquí, al final de todo el programa.
        teclado.close();
    }
}