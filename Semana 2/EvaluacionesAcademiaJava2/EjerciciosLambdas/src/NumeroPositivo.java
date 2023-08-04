import java.util.function.Predicate;
public class NumeroPositivo {
        public static void main(String[] args) {

            // Definimos la funcion lambda para comprobar si es positivo o no un numero
            Predicate<Integer> esPositivo = num -> num > 0;

            // Ejeucutamos la funcion lambda, asignamos los valores de referencia para que compile y nos de el resultado
            System.out.println(esPositivo.test(5));
            System.out.println(esPositivo.test(-2));
            System.out.println(esPositivo.test(-76));
        }
    }

