import java.util.function.BinaryOperator;
public class BinaryOperatorPotencia {
    public static void main(String[] args) {

        // Declaramos la funcion BinaryOperator, que recibe como parametros 2 valores de referencia
        BinaryOperator<Integer> powerFunction = (base, exponente) -> {
            int resultado= 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        };

        // Definimos la base y el exponente para calcular la potencia
        // se multiplica por si mismo el numero de veces que tiene el exponente
        int base = 5;
        int exponente = 2;

        // Ejecutamos la funcion apply de BinaryOperator
        int potenciaResultado = powerFunction.apply(base, exponente);

        // Imprimimos por pantalla la base, el exponente y el resultado de la potencia.
        System.out.println("Base: " + base);
        System.out.println("Exponent: " + exponente);
        System.out.println("Power Result: " + potenciaResultado);
    }

}
