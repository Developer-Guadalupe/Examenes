import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncontrarA {
    public static void main(String[] args) {

        //Creamos nuestra lista de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Yesung");
        nombres.add("Ryeowook");
        nombres.add("Donghae");
        nombres.add("Guadalupe");
        nombres.add("Mayte");
        nombres.add("Lucero");

        //Imprimimos todos los nombres de la lista
        System.out.println("Lista de nombres: \n" + nombres);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        // Creamos un stream para filtrar los nombres que contienen la letra "a" y almacenarlos en una nueva lista
        List<String> nombreTraeUnA = nombres.stream()
                .filter(nombre -> nombre.toLowerCase().contains("a"))
                .collect(Collectors.toList());

        //Imprimimos solo nombres que traen una letra a
        System.out.println("Nombres que contienen 'a' : \n" + nombreTraeUnA);



    }
}

