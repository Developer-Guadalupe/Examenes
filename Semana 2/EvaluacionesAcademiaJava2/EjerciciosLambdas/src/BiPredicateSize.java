import java.util.function.BiPredicate;
public class BiPredicateSize {
        public static void main(String[] args) {

            // Definimos una funcion BiPredicate que verifica si una cadena y un numero tienen el mismo tamaño
            BiPredicate<String, Integer> mismaLongitud = (cadena, numero) -> cadena.length() == numero;

            // Ejecutamos la funcion BiPredicate LAMBDA
            System.out.println(mismaLongitud.test("lUCERO", 6));
            System.out.println(mismaLongitud.test("GUADALUPE", 5));

        }
}

