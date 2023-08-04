import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.List;
public class BiConsumerSP {
        public static void main(String[] args) {
            // Creamos dos listas de diferentes tipos, String y Integer
            List<String> nombreSP = Arrays.asList("Siwon ", "Yesung ", "Eunhyuk ", "Ryeowook");
            List<Integer> edadeSP = Arrays.asList(35, 37, 35, 34);

            // Definimos el funcional BiConsumer para imprimir
            BiConsumer<String, Integer> imprimirPersona = (nombre, edad) ->
                    System.out.println(nombre + " tiene " + edad + " años.");

            // Ejecutamos el funcional Biconsumer (LAMBDA)
            for (int i = 0; i < nombreSP.size(); i++) {
                imprimirPersona.accept(nombreSP.get(i), edadeSP.get(i));
            }
        }
    }
