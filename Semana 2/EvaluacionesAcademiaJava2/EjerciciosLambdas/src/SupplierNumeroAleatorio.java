import java.util.Random;
import java.util.function.Supplier;
public class SupplierNumeroAleatorio {
        public static void main(String[] args) {

            // Definimos la funcion Supplier que ejecuta numeros entre 1 a 100
            Supplier<Integer> numeroAleatorioSupplier = () -> {
                // Creamos una instancia de Random para crear numeros aleatorios
                Random random = new Random();
                //Creamos numero aleatorios
                return random.nextInt(100) ;
            };

            // Ejecutamos lambda, para obtener el  número aleatorio
            int numeroAleatorio = numeroAleatorioSupplier.get();
            System.out.println("Numero aleatorio: " + numeroAleatorio);

        }
    }
