import java.util.Scanner;
public class TryWithResources {
        public static void main(String[] args) {

            //Creamos la variable de referencia
            String nombre;

            try {
                // Vamos a usar try-with-resources para abrir el recurso, yo voy a usar Scanner
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Ingrese tu nombre: ");
                    // Aqui se va a guardar lo que se ingresa por consola
                    nombre = scanner.nextLine();
                }

                int size = sizeChain(nombre);
                System.out.println("El tamaño de tu nombre es: " + size);
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Bloque finally: esta parte siempre se ejecuta");
            }
        }

        public static int sizeChain(String nombre) {
            if (nombre == null) {
                throw new NullPointerException("La cadena no puede ser nula");
            }
            if (nombre.isEmpty()) {
                throw new IllegalArgumentException("La cadena no puede estar vacía");
            }
            return nombre.length();
        }
    }

