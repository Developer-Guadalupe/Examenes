import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class DuplicarNumero {
        public static void main(String[] args) {

            // Creamos una variable de referencia de tipo lista de numeros enteros
            List<Integer> numeros = new ArrayList<>();
            //Agregamos numeros a la lista
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);

            // Creamos un stream, referenciando a la lista de numeros
            List<Integer> numerosDuplicados= numeros.stream()
                    // Ejecutamos la operaOperacion para duplicar cada objeto de la lista
                    .map(numero -> numero * 2)
                    //Pasame los resultados de la lista
                    .collect(Collectors.toList());

            // Imprimir la lista resultante
            System.out.println("Numeros sin duplicar: " + numeros);
            System.out.println("Numeros duplicados: " + numerosDuplicados);
        }
    }
