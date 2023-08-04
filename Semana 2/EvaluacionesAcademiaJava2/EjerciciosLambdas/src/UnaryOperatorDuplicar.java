import java.util.function.UnaryOperator;
public class UnaryOperatorDuplicar {
    public static void main(String[] args) {

        // Definimos la funcion UnaryOperator
        UnaryOperator<Integer> duplicadoNumero = num -> num * 2;

        // Creamos una variable de referencia
        int numero = 5;

        // Ejecutamos la función apply de la funcion UnaryOperator para obtener el resultado
        int resultado = duplicadoNumero.apply(numero);

        // Imprimimos el rsultado, con el numero antiguo y nuevo
        System.out.println("Numero Original: " + numero);
        System.out.println("Numero duplicado: " + resultado);
    }

}
