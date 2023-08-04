import java.util.function.Function;
public class ConvertirCaFFunction {
        public static void main(String[] args) {

            // Definimos la Function que convierte grados Celsius a grados Fahrenheit, usando la formula
            // F = C x 9/5 + 32
            Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9/5) + 32;

            // Ejecutamos la lambda function, para aplicar la conersion
            double celsius = 24.67;
            double fahrenheit = celsiusToFahrenheit.apply(celsius);
            System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

        }
    }
