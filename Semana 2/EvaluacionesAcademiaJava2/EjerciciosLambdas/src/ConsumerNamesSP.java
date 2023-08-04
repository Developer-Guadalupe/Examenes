import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerNamesSP {

    public static void main(String[] args) {

        System.out.println("Algunos integrantes de Super Junior: ");

        //Creando un arreglo de nombres
        List<String> nombres = Arrays.asList("Siwon", "Yesung", "Heechul", "Donghae");

        // Definimos el funcional Consumer(LAMBDA)
        Consumer<String> sp = nombre -> System.out.println(nombre);

        // Ejecutamos el funcional Consumer (LAMBDA)
        nombres.forEach(sp);

    }

}
