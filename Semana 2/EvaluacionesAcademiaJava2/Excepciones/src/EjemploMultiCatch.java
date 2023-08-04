public class EjemploMultiCatch {
        public static void main(String[] args) {

            //Creamos un String, asignando valor null, para llevar a cabo el Multicatch
            try {
                String name = null;
                int size = sizeChain(name);
                System.out.println("Tamaño de la cadena: " + size);
            } catch (NullPointerException | IllegalArgumentException e) {
                // Capturamos la excepcion (si ocurre) y mostramos el mensaje de error
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Este bloque siempre se ejecuta, haya o no una excepcion
                System.out.println("Bloque finally: esta parte siempre se ejecuta");
            }
        }

        public static int sizeChain(String name) {
            if (name == null) {
                // Lanzamos la excepcion NullPointerException si la cadena es nula
                throw new NullPointerException("La cadena no puede ser nula");
            }
            // Lanzamos la excepcion IllegalArgumentException si la cadena esta vacia
            // isEmpty: retorna "true", si la cadena esta vacía
            if (name.isEmpty()) {
                throw new IllegalArgumentException("La cadena no puede estar vacía");
            }
            // Si no hay excepciones, devolvemos el tamaño de la cadena
            return name.length();
        }
    }
