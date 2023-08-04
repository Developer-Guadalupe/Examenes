import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImparesPares {

        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Definimos la funcion Predicate que verifica si un numero es par
            Predicate<Integer> esPar = num -> num % 2 == 0;

            // Ejecutamos la funcion Predicate LAMBDA
            System.out.println("Números pares:");
            for (Integer num : numeros) {
                if (esPar.test(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }
